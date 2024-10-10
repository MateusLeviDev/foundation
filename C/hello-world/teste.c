#include <stdio.h>

int main() {
    float floatingVar = 235.89;
    int integerVar = 20;
    double doubleVar = 22.33e+1;
    char charVar = 'L';
    _Bool boolVar = 0;


    //printf("int: %a\n", integerVar);
    //printf("double: %c\n", doubleVar);

    double hour = 60;
    double day = hour * 24;
    double oneYear = day * 365;

    printf("Is: %f\n", oneYear);

    return 0;
}
