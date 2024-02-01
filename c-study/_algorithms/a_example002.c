#include<stdio.h>
#include<math.h>

void modifyNumber(int *prt) {
    *prt = 100; // <-
}

int main() {

    int number = 42;
    printf("%d\n", number);

    printf("After: \n");

    modifyNumber(&number); // ->

    printf("%d\n", number);

    return 0;
}