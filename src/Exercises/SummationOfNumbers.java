package Exercises;

public class SummationOfNumbers {

    /*Create a program that has a method named summation it needs
    to accept an array of integers then return the sum of the
    given array.

    PS: Display the SUM outside of the method.*/

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int result = summation(numbers);
        System.out.println("Sum of the Array : " + result);
    }
    static int summation(int[] numbers){
        int sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
//        for (int num : numbers) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
