/******************************************************
Determinando o tamanho e a faixa dos tipos...
******************************************************/

#include <stdio.h>
#include <limits.h> // Precisamos das constantes dos limites
#include <float.h>  // Limites dos tipos float e double

int main() {
    
    printf(
        "%-19s %s %25s %s\n\n"

        "(signed) int        %3ld   %25d %d\n"
        "unsigned int        %3ld   %25d %u\n"
        "(signed) short int  %3ld   %25d %d\n"
        "unsigned short int  %3ld   %25d %d\n"
        "(signed) long int   %3ld   %25ld %ld\n"
        "unsigned long int   %3ld   %25d %lu\n\n"
        
        "(signed) char       %3ld   %25d %d\n"
        "unsigned char       %3ld   %25d %d\n\n"
        
        "float               %3ld   %25e %e\n"
        "double              %3ld   %25e %e\n"
        "long double         %3ld   %25Le %Le\n\n",
        
        "TIPO", "BYTES", "MIN", "MAX",
        
        sizeof(int), INT_MIN, INT_MAX,
        sizeof(unsigned int), 0, UINT_MAX,
        sizeof(short int), SHRT_MIN, SHRT_MAX,
        sizeof(unsigned short int), 0, USHRT_MAX,
        sizeof(long int), LONG_MIN, LONG_MAX,
        sizeof(unsigned long int), 0, ULONG_MAX,
        
        sizeof(char), CHAR_MIN, CHAR_MAX,
        sizeof(unsigned char), 0, UCHAR_MAX,
        
        sizeof(float), FLT_MIN, FLT_MAX,
        sizeof(double), DBL_MIN, DBL_MAX,
        sizeof(long double), LDBL_MIN, LDBL_MAX
    );

    return 0;
}