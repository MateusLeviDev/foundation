#include <stdio.h>

int main()
{
    unsigned int a = 30; // 0001 1110
    unsigned int b = 15; // 0000 1111

    int result = 0;

    // 0000 1110
    result = a & b; //14    
    result = a | b; // 0001 1111 ¨
    result = a ^ b; // 0001 0001 
    result = ~a; // -31 ¨ - how about the negative product 
    result = a << 2; //added 2 zeros in 30 binary == 120 -> 1111000
    result = a >> 2; // 111 rs rs rs rs 

    result = b << 1; // 0001 1110 -> 30
    

    printf("%d\n", sizeof(b)); //4 bytes - each byte has 8 bitsexit


    printf("result is %d\n", result);

    return 0;
}
