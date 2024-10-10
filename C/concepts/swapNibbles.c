#include <stdio.h>

/*
    0x0F -> 0000 1111
*/
unsigned char swapNibbles(unsigned char num) {

    unsigned char lowerNibble = num & 0x0F;
    unsigned char upperNibble = (num >> 4) & 0x0F;

    unsigned char result = (lowerNibble << 4) | upperNibble;

    return result;

}

int main() {

    unsigned char number;

    printf("Digite um número de 8 bits (um byte): ");
    scanf("%hhu", &number);

    unsigned char result = swapNibbles(number);

    printf("Após a troca dos nibbles: %hhu\n", result);

    return 0;
    
}