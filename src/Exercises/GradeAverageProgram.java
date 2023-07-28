package Exercises;

import java.util.Scanner;

public class GradeAverageProgram {
    public static void main(String[] args) {

/*        Create a Program that will let the user input 4 Grades
        then make the program compute the average and
        display a message based on its value.

        If average:
        * Above 100 - Invalid Grade
        * 98 to 100 - With Highest Honors
        * 95 to 97.99 - With High Honors
        * 90 to 94.99 - With Honor
        * 75 to 89.99 - Passed
        * Below 75 - Failed

        Sample Output
        English: 95
        Math: 96
        Science: 94
        Computer: 99

        Average: 96
        With High Honors*/

        Scanner scanner = new Scanner(System.in);

        double englishGrade;
        double mathGrade;
        double scienceGrade;
        double computerGrade;
        double averageGrade;

        System.out.print("English : ");
        englishGrade = scanner.nextDouble();

        System.out.print("Math : ");
        mathGrade = scanner.nextDouble();

        System.out.print("Science : ");
        scienceGrade = scanner.nextDouble();

        System.out.print("Computer : ");
        computerGrade = scanner.nextDouble();

        averageGrade = (englishGrade + mathGrade +
                scienceGrade + computerGrade) / 4;

        System.out.println();
        System.out.println("Average : " + averageGrade);

        if(averageGrade >= 100) {
            System.out.println("Invalid Grade");
        } else if (averageGrade >= 98 && averageGrade <= 100) {
            System.out.println("With Highest Honors");
        } else if (averageGrade >= 95 && averageGrade <= 97.99) {
            System.out.println("With High Honors");
        } else if (averageGrade >= 90 && averageGrade <= 94.99) {
            System.out.println("With Honors");
        } else if (averageGrade >= 75 &&  averageGrade <= 89.99) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

    }
}
