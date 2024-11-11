package Solution;

import static java.lang.System.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        // Printing an explanation of the swapping process
        out.print("""
        Swapping two numbers without using a temporary variable:
        **********************************************************
        The swapping process works by manipulating the values 
        of the two variables through addition and subtraction.
        Initially, the sum of the two numbers is stored in one variable.
        The second variable is then derived from the sum, and finally, 
        the first variable is adjusted to complete the swap.
        """);

        int number1;
        int number2;

        // Creating a scanner object to read input
        Scanner keyboard = new Scanner(System.in);

        // Getting the first number from the user
        out.print("Enter the first number: ");
        number1 = keyboard.nextInt();

        // Getting the second number from the user
        out.print("Enter the second number: ");
        number2 = keyboard.nextInt();

        // Swapping the values without using a temporary variable
        // Step 1: Add both numbers and store the result in number1
        number1 = number1 + number2;

        // Step 2: Subtract the new number1 (sum) from number2 to get the original number1
        number2 = number1 - number2;

        // Step 3: Subtract the new number2 (which is now the original number1) from the sum 
        // to get the original number2
        number1 = number1 - number2;

        // Printing the swapped values
        out.println("After swapping:");
        out.println("Number 1: " + number1);  // The original second number
        out.println("Number 2: " + number2);  // The original first number
        out.println();
    }
}
