package Exercises;

public class SentenceBuilder {

    public static void main(String[] args) {

/*        Instruction: Create a program that will only require the programmer to change the variable values in order to
        create a dynamic sentence using the sentence in the Sample Output.

        PS: BOLD Words indicates a variable

        Sample Output
        Hi my name is Alex Mataac
        I'am 23 Years Old.
        My GPA is 2.25
        My blood type is o*/

        String name = "Alex Mataac";
        int age = 23;
        double averageGrade = 2.25;
        char bloodType = 'o';

        System.out.println("Hi my name is " + name);
        System.out.println("I'am " + age + " Years Old");
        System.out.println("My GPA is " + averageGrade);
        System.out.println("My blood type is " + bloodType);
    }
}

