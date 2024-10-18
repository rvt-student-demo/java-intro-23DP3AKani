package lv.rvt;

import java.util.*;

public class Stars {
    public static void printTriangle(int size) {
        printSpaces(size);
    }

    public static void printSpaces(int number) {
        System.out.println(number);
        for (int row = 0; row < number+1; row++) {
            for (int i = 4; i > 0; i--) {
                System.out.print("+");
            printStars(row);
            System.out.println();
            }
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }





    public static void printSpace(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStar(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void christmasTree(int height) {
        for ( int i = 0; i < height; i++ ) {
            printSpace( height - i );
            printStar( i * 2 + 1 );
            System.out.println();
        }
        for ( int i = 0; i < 2; i++ ) {
            printSpace( height - 1 );
            printStar(3);
            System.out.println();
        }
    }
}
