package Exercises;

import java.util.Scanner;

public class QuizGamesWithLives {
    public static void main(String[] args) {
/*        Create a program that will ask the user a question make the user answer that question,
        check if its correct if not deduct a life to the user and ask the question again until
        their lives runs out or they answer correctly.

        If they answered the question correctly then tell the user that they WON!.

        If they run out out of lives then tell the user that they LOST!.*/

        Scanner scanner = new Scanner(System.in);

        int lives = 3;
        String userAnswer;
        String correctAnswer = "Lupang Hinirang";

        while (lives > 0) {
            System.out.println("What is the National Anthem of the Philippines? ");
            System.out.print("Answer : ");
            userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Congratulations! You WON!");
                break;
            } else {
                lives--;

                if (lives > 0) {
                    System.out.println("Incorrect answer. Try Again");
                    System.out.println();
                } else {
                    System.out.println("Sorry! You LOST!");
                }
            }
        }
    }
}
