#include <stdio.h>

int main()
{
    unsigned int a = 50; // 0011 0010
    unsigned int b = 100;// 0110 0100

    int result1 = a & b; // 0010 0000 - 32
    printf("%d\n", result1);

    int result2 = a | b; // produto. os bits mais relevantes positivam
    printf("%d\n", result2);// 0111 0110

    int result3 = a >>= 2; // 0000 1100 || >>= equals >> 
    printf("%d\n", result3);

    int result4 = ~a; // negate // 0000 1101 invert number bits
    printf("%d\n", result4);

    int result5 = b^2; //use binary of 2 0000 0010 or 10ls
    printf("%d\n", result5);

    return 0;
}
