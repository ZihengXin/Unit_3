// 11/22 Charly. This program should be able to tell three length can form a right triangle or not.
// I have just correct my program into the form you want. 
import java.util.Scanner;

public class RightTriangle {
    public static boolean isTriangle(int a, int b, int c){
        return a+b>c && b+c>a && a+c > b;
    }

    public static boolean isRight(int a, int b, int c){
        return Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2);
    }
    public static void main(String[] args){
        System.out.println("Enter three integer sides of a triangle: ");
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        System.out.print(isRight(a,b,c));

        if(isTriangle(a, b, c) && isRight(a, b, c))
            System.out.println("The side lengths of "+a+", "+b+", and "+c+" form a right triangle");
        else if(isTriangle(a, b, c) && !isRight(a, b, c))
            System.out.println("The side lengths of "+a+", "+b+", and "+c+" form a  triangle, but it is not a right triangle");
        else
            System.out.println("The side lengths of "+a+", "+b+", and "+c+" do not form a triangle");
    }
}
