package Exercises;

import java.util.Scanner;

public class DateFormatter {
    public static void main(String[] args) {
/*        Create a Program that will make the user input the Month, Date and Year as Integers
        then use switch statement and concatenation to display it in this format:

        Sample Output:
        Month: 1
        Date: 13
        Year: 2020

        January 13, 2020

        PS: If the user inputs an invalid Month then you should tell the user that
        it is invalid by using the default keyword.

        OPTIONAL: Check if the user inputs an invalid date if its greater than 31 (Using Conditional Statements)*/

        Scanner scanner = new Scanner(System.in);

        int month;
        int date;
        int year;

        System.out.print("Month : ");
        month = scanner.nextInt();

        System.out.print("Date : ");
        date = scanner.nextInt();

        System.out.print("Year : ");
        year = scanner.nextInt();

        String monthWord = "";
        System.out.println();
//        if (date > 31 || date <= 0) {
//            System.out.println("Invalid Date");
//        } else if (year <= 0) {
//            System.out.println("Invalid Year");
//        } else {
//
        switch (month) {
            case 1:
                monthWord = "January";
//                    System.out.println("January " + date + "," + year);
                break;
            case 2:
                monthWord = "February";
//                    System.out.println("February " + date + "," + year);
                break;
            case 3:
                monthWord = "March";
//                    System.out.println("March " + date + "," + year);
                break;
            case 4:
                monthWord = "April";
//                    System.out.println("April " + date + "," + year);
                break;
            case 5:
                monthWord = "May";
//                    System.out.println("May " + date + "," + year);
                break;
            case 6:
                monthWord = "June";
//                    System.out.println("June " + date + "," + year);
                break;
            case 7:
                monthWord = "July";
//                    System.out.println("July " + date + "," + year);
                break;
            case 8:
                monthWord = "August";
//                    System.out.println("August " + date + "," + year);
                break;
            case 9:
                monthWord = "September";
//                    System.out.println("September " + date + "," + year);
                break;
            case 10:
                monthWord = "October";
//                    System.out.println("October " + date + "," + year);
                break;
            case 11:
                monthWord = "November";
//                    System.out.println("November " + date + "," + year);
                break;
            case 12:
                monthWord = "December";
//                    System.out.println("December " + date + "," + year);
                break;
            default:
//                    System.out.println("Invalid Month");
//            }
        }
        System.out.println();
        if (monthWord == "") {
            System.out.println("Invalid Month");
        } else if (date > 31 || date <= 0) {
            System.out.println("Invalid Date");
        } else {
            System.out.println(monthWord + " " + date + "," + year);
        }

    }
}

