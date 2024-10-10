#include <stdio.h>

int main() {

    int valor = 10, *pvalor = &valor;

    printf("%d\n", valor);   // Imprime 10...
    printf("%d\n", *pvalor); // Imprime 10...
    printf("%x\n", &valor);
    printf("%p\n", pvalor);  // Imprime um endereço...

    return 0;
}