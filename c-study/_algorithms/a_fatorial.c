#include <stdio.h>

unsigned long long calculateFactorial(int n) {
    return (n == 0 || n == 1) ? 1 : n * calculateFactorial(n - 1);
}

int main() {
    int num;

    printf("Insira um número para calcular o fatorial: ");
    scanf("%d", &num);

    (num < 0) ? printf("O fatorial não está definido para números negativos.\n") 
    : printf("O fatorial de %d é %llu\n", num, calculateFactorial(num));


    return 0; 
}