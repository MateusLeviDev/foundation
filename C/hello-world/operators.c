#include <stdio.h>

int main() {
    int a = 10;
    int b = 34;
    int result = a - b;

    printf("Result: %d\n", result);
    printf("%d\n", --a); //execute before end. a++ after

    printf("----------------"); //a = 9

    _Bool c = !((a - b) >= 0) && !((b - a) == 24);
    printf("Result is: %d\n", c);

    return 0;
}