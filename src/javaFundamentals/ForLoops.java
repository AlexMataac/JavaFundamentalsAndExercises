package javaFundamentals;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = {"David", "Denim", "Love", "Pen", "Shoppe", "Alex","John"};

        System.out.print("Name to Search : ");
        String search = scanner.nextLine();

        int i;
        for (i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("We Found " + names[i]);
                break;
            } else {
                System.out.println(names[i]);
            }
        }
    }
}
