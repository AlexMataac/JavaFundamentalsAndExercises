package javaFundamentals;

public class Methods {

   /* Global Variable*/
    static String section = "B";
//    static int num = 25;


    public static void main(String[] args) {

//        String x = "Alex";

//        saySection();
//        sayNumber();
//        print("Hello, " + x);
//        int sum = divide(10, 15);
//        System.out.println(sum);
        System.out.println(add(5,2));


        System.out.println(isLegalAge(18));

//        greet("Alex", 23);
    }

//    static void greet() {
       /* Local Variable*/
//        String greetings = "What's up";
//        System.out.println(greetings);
//    static  void saySection() {
//        System.out.println(section);
//    }
//    static void sayNumber() {
//        System.out.println(num);
//    }
//
////    static void add(int num1, int num2) {
////        System.out.println(num1 + num2);
////    }
//    static void greet(String name, int age) {
//        print("Hello, " + name);
//        print("You are " + age + " Years Old.");
//    }
//    static void print(String word) {
//        System.out.println(word);
//    }
    static int add(int num1, int num2) {
        return num1 + num2;
    }
    static int substract(int num1, int num2) {
        return num1 - num2;
    }
    static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    static int divide(int num1, int num2) {
        return num1 / num2;
    }

    static boolean isLegalAge(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

}

