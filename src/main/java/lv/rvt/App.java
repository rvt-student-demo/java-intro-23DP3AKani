package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Give speed:");
            int speedInp = Integer.valueOf(scanner.nextLine());

        if (speedInp > 120){
            System.out.println("Speeding ticket!");
        }
        
    }

}
