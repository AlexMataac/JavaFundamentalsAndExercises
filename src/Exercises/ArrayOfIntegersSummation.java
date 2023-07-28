package Exercises;

import java.util.Scanner;

public class ArrayOfIntegersSummation {

    public static void main(String[] args) {
    /*    Create a program that will add every integers inside
        a pre - defined array and display its total sum.*/

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int sum = 0;


//        System.out.print("Number : ");
//        sum = scanner.nextInt();
//        System.out.print("Number 2 : ");
//        int num2 = scanner.nextInt();

        for (int num: numbers) {
            sum = sum + num;
        }
        System.out.println("Result: " + sum);
    }
}
