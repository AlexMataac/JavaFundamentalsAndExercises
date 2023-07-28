package Exercises;

import java.util.Scanner;

public class InputAndArithmeticOperators {
    public static void main(String[] args) {
/*        Create a program that will make the User Input the 2 numbers and
        perform one of the arithmetic operators excluding increment and decrement.

        Sample Output
        Num1 : 5
        Num2 : 5
        Result: 5 + 5 = 10*/

        double num1;
        double num2;
        double result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your First Number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter your Second Number: ");
        num2 = scanner.nextDouble();

        result = num1 / num2;

        System.out.println();
        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

//        System.out.print("Result: 5 + 5 = ");
//        System.out.println(num1 + num2);

    }
}
