// 10/29 Charly. This programs should tell you how many roots does a quadratic equation has.
import java.util.Scanner;

public class DiscriminantAndRoots {
    public static void main(String[] args){
        System.out.println("Enter the coefficients for a quadratic equation: ");
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        System.out.println(roots(a, b, c));
    }
    public static String roots(int a, int b, int c){
         double delta= b*b-(4*a*c);
         System.out.print(a+"x^2 +"+b+"x +"+c+" has ");
         if (delta<0)
             return "2 imaginary roots";
         else if (delta==0)
             return "1 real root";
         else if (delta>0)
             return "2 real roots";
         else return "";
    }
}
