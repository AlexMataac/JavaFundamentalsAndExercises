package javaFundamentals;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String employeeNames[] = new String[5];
        int evenNumbers[] = new int[2];

        System.out.print("Enter Employee Name: ");
        employeeNames[0] = scanner.nextLine();

        System.out.println(employeeNames[0]);

//        String studentNames[] = {"Alex","John","Vincent","Ace","Jay"};
//        studentNames[0] = "Emman";
//        System.out.println(studentNames[0]);
//        System.out.println(studentNames[2]);
//        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(numbers[3] + numbers[6]);
    }
}
