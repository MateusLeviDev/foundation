#include <stdio.h>

int main() {

    int grades[10];
    int count = 10;
    long sum;
    float average = 0.0F;

    printf("\nEnter the grades:\n");

    for (int i = 1; i <= count; i++) {
        printf("%2u> ", i);
        scanf("%d", &grades[i]);
        sum += grades[i];
    }

    return 0;
}