// 10.21 Charly. This program should tell you some basic information of the values you enter.
import java.util.Scanner;

public class NumericComparisons {
    private static boolean isZero(int a){
        return a==0;
    }
    private static boolean isPositive(int a){
        return a>0;
    }
    private static boolean isNegative(int a){
        return a<0;
    }
    private static boolean isNonNegative(int a){
        return a>=0;
    }
    private static boolean isNonPositive(int a){
        return a<=0;
    }
    private static boolean isOdd(int a){
        return a/2!=0;
    }
    private static boolean isMultiple(int a,int b){
        return a/b==0;
    }
    private static boolean isFactor(int a,int b){
        return b/a==0;
    }
    public static void main(String[] args){
        System.out.print("Enter the first  number: ");
        Scanner input= new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Enter the second  number: ");
        int num2 = input.nextInt();
        System.out.println(num1 + " is odd: " + isOdd(num1));
        System.out.println(num1 + " is positive: " + isPositive(num1));
        System.out.println(num1 + " is negative: " + isNegative(num1));
        System.out.println(num1 + " is non negative: " + isNonNegative(num1));
        System.out.println(num1 + " is zero: " + isZero(num1));
        System.out.println(num1 + " is non positive: " + isNonPositive(num1));
        System.out.println(num1 + " is a multiple for num2: " + isMultiple(num1,num2));
        System.out.println(num1 + " is a factor for num2: " + isFactor(num1,num2));
    }
}
