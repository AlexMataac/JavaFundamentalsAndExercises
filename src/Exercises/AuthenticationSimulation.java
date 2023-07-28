package Exercises;

import java.util.Scanner;

public class AuthenticationSimulation {
    public static void main(String[] args) {
/*        Create a program that has 2 sets of arrays w/ Values
        already one for the username and one for the password,
        the username and password should be paired by index,
        Let the user input a username and pass word then
        check if the account exists on the 2 sets of arrays.

        If the username and password doesn't match then
        display "Account Not Found".

        If the username and password matches then display
        "Welcome, {Username}".*/

        Scanner scanner = new Scanner(System.in);

        String usernames[] = {
                "kuzzwagner",
                "alexpogi"
        };
        String passwords[] = {
                "wagner123",
                "pogiako"
        };

        String username;
        String password;

        System.out.print("User Name : ");
        username = scanner.nextLine();

        System.out.print("Password : ");
        password = scanner.nextLine();

        System.out.println();

//        boolean isExist = false;

        int i;
        for (i = 0; i < usernames.length; i++) {

            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
//                isExist = true;
                System.out.println("Index : " + i);
                System.out.println("Welcome, " + username);
                break;
            }
        }
        if (i == usernames.length) {
            System.out.println("Account Not Found");
        }
    }
//        if (isExist) {
//            System.out.println("Welcome, " + username);
//        } else {
//            System.out.println("Account Not Found");
}
