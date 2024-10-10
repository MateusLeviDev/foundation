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

    taxes = (grossPay <= 300) ? grossPay * RATE_1 : 
    (grossPay <= 450) ? 300 * RATE_1 + (grossPay - 300) * RATE_2 : 
    300 * RATE_1 + 150 * RATE_2 + (grossPay - 450) * RATE_3;

    netPay = grossPay - taxes;

    printf("\nSalário Bruto: $%.2f\n", grossPay);
    printf("Impostos: $%.2f\n", taxes);
    printf("Salário Líquido: $%.2f\n", netPay);
    
}