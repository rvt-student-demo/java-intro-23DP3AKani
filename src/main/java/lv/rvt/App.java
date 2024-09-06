package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // Comment

        // VScode keybind: Ctrl + /
        
        // Scanner scanner = new Scanner(System.in);
        
        // String input = scanner.nextLine();

        // System.out.println("Sveiks " + input + "!");

        // String name = "Alex";
        // int age = 20;
        // boolean isOnline = true;

        // System.out.println("Once upon a time");
        // System.out.println("There was");
        // System.out.println("a program");
        // System.out.println(name, age, isOnline);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ieavadi savu vārdu: ");
        String name = scanner.nextLine();

        System.out.println("Ieavdi savu uzvārdu: ");
        String lastname = scanner.nextLine();

        System.out.println("Ieavadi savu grupu: ");
        String group = scanner.nextLine();

        System.out.println("Students: " + name + " " +  lastname + ", grupa: " + group);

    }

}
