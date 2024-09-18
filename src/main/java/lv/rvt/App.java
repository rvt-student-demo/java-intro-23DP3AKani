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


        // System.out.println("Ieavadi savu vārdu: ");
        // String name = scanner.nextLine();

        // System.out.println("Ieavdi savu uzvārdu: ");
        // String lastname = scanner.nextLine();

        // System.out.println("Ieavadi savu grupu: ");
        // String group = scanner.nextLine();

        // System.out.println("Students: " + name + " " +  lastname + ", grupa: " + group);
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first_number = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int second_number = Integer.valueOf(scanner.nextLine());

        int plus = first_number + second_number;
        int minus = first_number - second_number;
        int multiply = first_number * second_number;
        double division = (double) first_number / second_number;

        System.out.println(first_number + " + " + second_number + " = " + plus);
        System.out.println(first_number + " - " + second_number + " = " + minus);
        System.out.println(first_number + " * " + second_number + " = " + multiply);
        System.out.println(first_number + " / " + second_number + " = " + division);



    }

}
