// 10/22 Charly. This program should be able to execute the program 10 times and tell you the
// positive and negative sum.
import java.util.Scanner;
    public class AddToPositiveOrNegativeSum {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int positiveSum = 0;
            int negativeSum = 0;
            for (int i = 1; i <= 10; i++) {
                /* in this block, allow the user to input a number and add the number to the appropriate sum */
                System.out.println("Enter a number: ");
                int number = input.nextInt();
                if (number > 0)
                    positiveSum += number;
                if (number <= 0)
                    negativeSum += number;
            }
            System.out.println(" ");
            System.out.println("The sum of the positive numbers is "+positiveSum);
            System.out.println("The sum of the negative numbers is " + negativeSum);
        }
    }