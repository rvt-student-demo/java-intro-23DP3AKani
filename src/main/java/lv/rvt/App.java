package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;


public class App 
{
    public static void main( String[] args ) {
        //Stars.printTriangle(4);
        //Third_element();
        //Second_plus_third();
       // Stars.christmasTree(4);
        Only_this_numbers();
    }
    
    public static void divisibleByThreeInRange_simple() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start digit: ");
        int start_num = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter end digit: ");
        int end_num = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(start_num, end_num);
    }

    public static void divisibleByThreeInRange( int num1, int num2 ) {
        System.out.println("Range digits, devisible by three>>>");
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void Third_element() {

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Tom");
        wordList.add("Emma");
        wordList.add("Alex");
        wordList.add("Mary");

        System.out.println(wordList.get(2));

        wordList.remove("Alex");

        System.out.println(wordList.get(2));

    }    

    public static void Second_plus_third() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int num = 1;
        System.out.println("Print a digit: ");
        while (num != 0) {
            num = Integer.valueOf(scanner.nextLine());
            numbers.add(num);
        }

        int second_num = numbers.get(1);
        int third_num = numbers.get(2);

        System.out.println(second_num + third_num);
        
    }

    public static void Only_this_numbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        System.out.println();
        while (num != -1) {
            num = Integer.valueOf(scanner.nextLine());
            numbers.add(num);
        }

        System.out.println("From where?");
        int startIndex = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int endIndex = Integer.valueOf(scanner.nextLine());

        if ( endIndex > numbers.size() - 1 || startIndex < 0 ) {
            System.out.println("Out of list range");
        }

        System.out.println();
        for ( int i = startIndex; i <= endIndex; i++ ) {
            int result = numbers.get(i);
            System.out.println(result);
        }
    }
}