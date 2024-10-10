#include <stdio.h>

int a = 10;
int b = 30;
int c = 40;

int faz_nada() {
    int c = 15;

    return c;
}

int main() {
     int b = 5;

     printf("a %d\nb: %d\nc: %d\n", a, b, faz_nada);

     return 0;
}