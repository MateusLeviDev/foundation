#include<stdio.h>
#include<math.h>

int main() {

    int number;

    scanf("%d", &number);

    (((number % 5) == 0) && ((number % 3 == 0))) ? printf("Deu bom\n----------") : printf("Deu ruim\n----------");

    

    return 0;
}