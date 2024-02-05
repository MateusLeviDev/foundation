#include<stdio.h>
#include<stdbool.h>

bool isPrime(int n) {
    if (n < 2) {
        return false;
    }

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}

int main() {
   int limite;
    printf("Insira um número limite: ");
    scanf("%d", &limite);

    if (limite < 2) {
        printf("Não existem números primos até %d.\n", limite);
    } else {
        long long int somaPrimos = 0;

        for (int i = 2; i <= limite; i++) {
            if (isPrime(i)) {
                somaPrimos += i;
            }
        }

        printf("A soma dos números primos até %d é: %lld\n", limite, somaPrimos);
    }

    return 0;
}