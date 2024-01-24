#include <stdio.h>
#include <stdlib.h>

int main() {
    enum Company { GOOGLE, FACEBOOK, OPENAI, EBAY, MERCADO_LIVRE, REDHAT };

    enum Company google = GOOGLE;
    enum Company redhat = REDHAT;
    enum Company mercadolivre = MERCADO_LIVRE;

    printf("Google value is %d\n", google);

    return 0;
};