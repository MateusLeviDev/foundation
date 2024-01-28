#include <stdio.h>

int countSetBits(unsigned int num) {

    int count = 0;

    while (num)
    {
        count += num & 1; //0000 0001 // 0000 1000 (10) //  10100 (20)
        num >>= 1; // continuar ate todos os num 'num' sejam zeros 
    }

    return count;
}

int main() {

    unsigned int number;

    printf("Digite um número inteiro sem sinal: ");
    scanf("%u", &number);

    int result = countSetBits(number);

    printf("O número de bits definidos em %u é: %d\n", number, result);

    return 0;
    
}