#include <stdio.h>

int main(void)
{
    int a=3, b=2;

    printf("%d + %d = %d", --a, b, a+b);  
}

// gcc-4.7.3 evaluates the function parameters from right to left. When a+b is evaluated, a is still 3.