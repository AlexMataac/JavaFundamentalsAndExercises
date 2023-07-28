package javaFundamentals;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 5) {
//            System.out.println("Hello World");
//            i++;
//        }
//        While-Loops

        Scanner scanner = new Scanner(System.in);
        String[] names = {"David", "Denim", "Love", "Pen", "Shoppe", "Alex","John"};

        System.out.print("Name To Search : ");
        String search = scanner.nextLine();
        int i = 0;

        while (i < names.length) {

            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("We Found " + names[i]);
//            System.out.println(names[i]);
//                i++;
                break;
            } else {
                System.out.println(names[i]);
            }
            i++;
        }
//        System.out.println("FINISH");
//        Do-While
//        int i = 5;
//
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 5);
    }
}

