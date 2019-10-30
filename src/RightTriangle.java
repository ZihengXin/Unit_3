// 10/30 Charly. This program should be able to tell three length can form a right triangle or not.
import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args){
        System.out.println("Enter three integer sides of a triangle: ");
        Scanner input= new Scanner(System.in);
        int lengthOne= input.nextInt();
        int lengthTwo= input.nextInt();
        int lengthThree= input.nextInt();
        System.out.print(isRight(lengthOne,lengthTwo,lengthThree));
    }
    public static String isRight(int a, int b, int c){
        if (((a+b)>c)&&((a+c)>b)&&((b+c)>a)){
            if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(b*b+c*c==a*a))
                return "The side lengths of "+a+", "+b+", and "+c+" form a right triangle";
            else
                return "The side lengths of "+a+", "+b+", and "+c+" form a  triangle, but it is not a right triangle";
        }
        else
            return "The side lengths of "+a+", "+b+", and "+c+" do not form a triangle";
    }
}
