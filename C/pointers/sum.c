#include <stdio.h>

int main() {

    char c = 'A', *pc = &c;
    int i = 10, *pi = &i;
    double d = 1.5, *pd = &d;

    printf("pc = %p; pc + 1 = %p\n", pc, pc + 1);
    printf("pi = %p; pi + 1 = %p\n", pi, pi + 1);
    printf("pd = %p; pd + 1 = %p\n", pd, pd + 1);

    return 0;
}
