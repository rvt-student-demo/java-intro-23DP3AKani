package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start digit: ");
        int start_num = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter end digit: ");
        int end_num = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(start_num, end_num);
    }

    public static void divisibleByThreeInRange(int num1, int num2) {
        System.out.println("Range digits, devisible by three>>>");
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
