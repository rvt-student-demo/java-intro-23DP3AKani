package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?: ");
        int num = scanner.nextInt();
        
        int sum = 0;

        for (int i = 0; num >= i; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }

}
