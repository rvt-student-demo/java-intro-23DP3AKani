package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class App {
    public static void main( String[] args ) {
        // Account class
        Account myObj1 = new Account("Matthews account", 1000);
        Account myObj2 = new Account("My account", 0);
    
        myObj1.withdraw(100);
        myObj2.deposit(100);

        myObj1.toString();
        myObj2.toString();
        
        // Person class
        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);

        juhana.setHeight(175);
        juhana.setWeight(64);

        System.err.println(matti.toString());
        System.err.println(juhana.toString());
        
        // Product class
        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
        System.err.println();

        // DecreasingCounter class
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        // Statistics class
        System.out.println();
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());

        // Payment Card class
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println(paulsCard.toString());
        System.out.println(mattsCard.toString());
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println(paulsCard.toString());
        System.out.println(mattsCard.toString());
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println(paulsCard.toString());
        System.out.println(mattsCard.toString());

        //Clock class
        //Clock clock = new Clock();

        //while (true) {
        //    System.out.println(clock);
        //    clock.advance();
        //}

        //Timer timer = new Timer();

        //while (true) {
        //    System.out.println(timer);
        //    timer.advance();

        //    try {
        //         Thread.sleep(10);
        //    } catch (Exception e) {
        //
        //    }
        //}

        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        tapeMeasure.printProduct();
        plaster.printProduct();
        tyre.printProduct();
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

    public static void Array_ar_rndm_numbers() {
        Random random = new Random();
        
        int[] numbers = new int[10];
        for ( int i = 0; i < numbers.length; i++ ) { //fill array with random elements
            int randomNum = random.nextInt(11);
            numbers[i] = randomNum;
        }

        int min = numbers[0];
        int max = numbers[0];
        int summ = 0;
        for ( int i = 0; i < numbers.length; i++ ) { //searching for min and max elements
            System.out.print(numbers[i] + " "); //printing the array
            summ += numbers[i];

            if ( numbers[i] < min ) {
                min = numbers[i];
            }

            else if ( numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println();
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);
        System.out.println();
        System.out.println("Avarage:" + summ/10);

    }

    public static void Bubble_sort() {

        int numbers[] = {4, 1, 5, 3, 9, 8, 6, 2, 7, 0};

        int length = numbers.length;

        for ( int i = 0; i < length; i++ ) {
            for ( int j = 0; j < length - 1; j++ ) {
                if ( numbers[j] > numbers[j + 1] ) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for ( int i = 0; i < length; i++ ) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void Personal_details() {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        
        ArrayList<String> dataNames = new ArrayList<>();
        ArrayList<Integer> dataBirthdays = new ArrayList<>();

        while (loop != false) {
            String dataPerson = scanner.nextLine();
            String[] dataLocal = dataPerson.split(",");

            if ( dataPerson.isEmpty() ) {
                loop = false;
            }
            else {
                dataNames.add(dataLocal[0]);
                //dataBirthdays.add();
            }
        }

    }
}