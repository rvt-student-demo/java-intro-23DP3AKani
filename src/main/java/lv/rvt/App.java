package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the num: ");
        int num = scanner.nextInt();
        
        for (int i = 0; num >= i; i++) {
            System.out.println(i);
        }
    }

}
