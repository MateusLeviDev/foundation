#include <stdio.h>

#define RATE_1 0.15
#define RATE_2 0.20
#define RATE_3 0.25
#define PAY_RATE 12.0 
#define OVERTIME_THRESHOLD 40

int main() {
    
    double hoursWorked, grossPay, taxes, netPay;

    printf("Hours worked: ");
    scanf("%lf", &hoursWorked);
    
    grossPay = (hoursWorked <= OVERTIME_THRESHOLD) ? 
    (hoursWorked * PAY_RATE) : 
    (OVERTIME_THRESHOLD * PAY_RATE + (hoursWorked - OVERTIME_THRESHOLD) * PAY_RATE * 1.5);

    printf("%.5f\n", grossPay);

    //TODO: .....
}