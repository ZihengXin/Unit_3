// 10/22 Charly. This program should be able to tell the larger value that you entered.
import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args){
        System.out.print("Enter the first number: ");
        Scanner input= new Scanner(System.in);
        int firstNumber=input.nextInt();
        System.out.print("Enter the first number: ");
        int secondNumber=input.nextInt();
        if (firstNumber>secondNumber)
            System.out.print(firstNumber+" is larger than "+secondNumber+".");
        if (firstNumber==secondNumber)
            System.out.print(firstNumber+" and "+secondNumber+" are equal.");
        if (firstNumber<secondNumber)
            System.out.print(secondNumber+" is larger than "+firstNumber+".");
    }
}
