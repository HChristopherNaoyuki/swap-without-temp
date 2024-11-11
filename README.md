# Number Swapper

**NumberSwapper** is a simple Java program that demonstrates how to swap two numbers without using a temporary variable. Instead of using a third variable, the program uses basic arithmetic operations (addition and subtraction) to swap the values of two integers.

## How It Works

1. The program accepts two integer inputs from the user.
2. It performs the swap using the following steps:
   - First, it adds the two numbers together and stores the result in the first variable.
   - Then, it subtracts the second number from the sum to retrieve the original first number and assigns it to the second variable.
   - Finally, it subtracts the new second number (which is now the original first number) from the sum to get the original second number and assigns it to the first variable.
   
This technique avoids the need for a temporary variable while effectively swapping the values.

## Example

```
Enter the first number: 5
Enter the second number: 10

After swapping:
Number 1: 10
Number 2: 5
```

## Purpose

This project is intended as a demonstration of basic algorithmic techniques in Java, especially in scenarios where memory optimization is important, and avoiding additional variables is desired.
