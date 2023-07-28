package javaFundamentals;

public class TwoDimensionalArraysAndNestedForLoops {
    public static void main(String[] args) {
//        String users[][] = {
//                {"David", "david123"},
//                {"Alex", "alex123"},
//                {"John", "john123"},
//                {"Vincent", "vincent123"}
//        };
//
//        int numbers[][] = new int[4][2];
//
//        users[0][0] ="Alex";
//        System.out.println(users[2][0]);


//        for (int i = 0; i < 5; i++) {
//            for(int x = 0; x < 5; x++) {
//                System.out.println(i + " : " + x);
//            }
//            System.out.println();
//        }

//        Nested For Loops
//        String users[][] = {
//                {"David", "david123"},
//                {"Alex", "alex123"},
//                {"John", "john123"},
//                {"Vincent", "vincent123"}
//        };
//        for (int row = 0; row < users.length; row++) {
//
//            for (int col = 0; col < users[row].length; col++) {
////                System.out.println(row + " " + col);
//                System.out.println(users[row][col]);
//            }
//            System.out.println();
//        }

//         Nested For Each

        String users[][] = {
                {"David", "david123"},
                {"Alex", "alex123"},
                {"John", "john123"},
                {"Vincent", "vincent123"}
        };

        for (String user[]:users) {

            for (String info:user)
                System.out.println(info);
            System.out.println();
        }
    }
}

