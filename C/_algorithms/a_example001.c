#include <stdio.h>

int main() {
    long sum;
    int numbers[5];

    printf("\nEnter a array of int: [ 'q' to quit]\n");

    for (int i = 1; i <= 5; i++) {
        printf("%2u> ", i);
        scanf("%d", &numbers[i]);

        if (numbers[i] % 2 == 0) {
            printf("%d", numbers[i]);
        }
    }

    int array[] = {1, 2, 3, 4, 5};
    int tamanho = sizeof(array) / sizeof(array[0]); 

    for (int i = 0; i < tamanho; i++) {
        printf("%d ", array[i]);
    }


    return 0;
}