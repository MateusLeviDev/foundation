#include <stdio.h>
#include <stdlib.h>
#define MILHA 0.6213

int main(int argc, char *argv[]) {

    float km = atof(argv[1]);
    float ml = km * MILHA;

    printf("%.2f miles\n", ml);

    return 0;
}