package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        
        int num = 0;
        int sum = 0;
        int quan = 0;
        int even = 0;
        int odd = 0;

        while (num != -1){
            quan += 1;
            sum += num;
            num = scanner.nextInt();

            if (num % 2 == 0){
                even += 1;
            }
            
            else {
                odd += 1;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + (quan-1));
        System.out.println("Average: " + (double) sum/(quan-1));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + (odd-1));
    }

}
