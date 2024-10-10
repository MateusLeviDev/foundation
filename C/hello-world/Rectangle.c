#include <stdio.h>

int main() {
    double height = 32.3;
    double width = 15.3;
    double perimeter = 2 * (height + width);

    printf("The area is:  %.2f\n", (height * width));
    printf("The perimeter is:  %.2f\n", perimeter);

    return 0;
}