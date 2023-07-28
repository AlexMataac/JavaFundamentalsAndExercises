package javaFundamentals;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        boolean hasRuler = true;
//        boolean hasBallpen = false;
//
//        if(!hasBallpen) {
//            System.out.println("You can Come In");
//        } else {
//            System.out.println("You can Come Home");
//        }

        System.out.print("Enter Age : ");
//        String greet = scanner.nextLine();

//        if(greet.equalsIgnoreCase("Hello")) {
//            System.out.println("Hi");
//        }
        int age = scanner.nextInt();
        boolean isVerified = true;

//        if(age >= 18) {
//            System.out.println("You Have Access");
//        } else if(age >=13 ) {
//            System.out.println("You Need Parent Consent!");
//        } else {
//            System.out.println("Access Denied");
//        }
//        Nested

//        if (age >= 18) {
//            System.out.println("You Have Access");
//
//            if (isVerified) {
//                System.out.println("Qualified");
//            } else {
//                System.out.println("Not Qualified");
//            }
//        } else if (age >= 13) {
//            System.out.println("You Need Parent Consent");
//          if (isVerified) {
//                System.out.println("Not Qualified");
//            }
//        }else {
//            System.out.println("Access Denied");
//        }

        if(age >= 18 && isVerified) {
            System.out.println("You Have Access and is Qualified");
        } else if (age >= 18 && !isVerified) {
            System.out.println("You Have Access but Not Qualified");
        } else {
            System.out.println("Access Denied");
        }
    }
}

