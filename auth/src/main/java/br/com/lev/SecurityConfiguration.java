package br.com.lev;

import br.com.lev.user.UserApiDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private UserApiDetailService userApiDetailService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeHttpRequests(registry -> {
            registry.requestMatchers("/home").permitAll();
            registry.requestMatchers("/admin/**").hasRole("ADMIN");
            registry.requestMatchers("/user/home").hasRole("USER");
            registry.anyRequest().authenticated();
                }
        )
                .formLogin(AbstractAuthenticationFilterConfigurer::permitAll)
                .build();
    }

    //users in memory
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails normalUSer = User.builder()
//                .username("ml")
//                .password("$2a$12$eYRZ/sEnmtFobg/VPwXfkOMhhT9gig72dnWqYw6laZpZPEyo2BdDG")
//                .roles("USER")
//                .build();
//
//        UserDetails adminUSer = User.builder()
//                .username("admin")
//                .password("$2a$12$F3HSN4aH8N/IulpszRyIceYSDmfXu/2WxMS9BzQ1jyoi1vy.AxP22")
//                .roles("ADMIN", "USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(normalUSer, adminUSer);
//    }

    @Bean
    public UserDetailsService userDetailsService() {
        return userApiDetailService;
    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userApiDetailService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
