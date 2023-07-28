package PracticeProgram;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {



        System.out.print("Enter your Birthdate: ");
        LocalDate currentDate = LocalDate.now();
        LocalDate birthdate = LocalDate.of(1999, 8,31);
        int years = Period.between(birthdate, currentDate).getYears();
        System.out.println(years);
    }
}
