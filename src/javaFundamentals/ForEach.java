package javaFundamentals;

import java.util.Scanner;

public class ForEach {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = {"David", "Denim", "Love", "Pen", "Shoppe", "Alex","John"};

        System.out.print("Name to Search: ");
        String search = scanner.nextLine();

        for (String name: names) {

            if(name.equalsIgnoreCase(search)) {
                System.out.println("We Found " + name);
                break;
            } else {
                System.out.println(name);
            }
        }
    }
}

