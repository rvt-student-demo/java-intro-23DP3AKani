package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int speedInp = Integer.valueOf(scanner.nextLine());

        if (speedInp < 0) {
            System.out.println("impossible!");
        } else if (speedInp < 50) {
            System.out.println("failed");
        } else if (speedInp < 60) {
            System.out.println("1");
        } else if (speedInp < 70) {
            System.out.println("2");
        } else if (speedInp < 80) {
            System.out.println("3");
        } else if (speedInp < 90) {
            System.out.println("4");
        } else if (speedInp < 101) {
            System.out.println("5");
        } else if (speedInp > 100) {
            System.out.println("incredible!");
        }
        
    }

}
