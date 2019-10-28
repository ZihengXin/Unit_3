// 10/28. Charly. This program should be able to tell you the slope of a line. 
import java.util.Scanner;
public class SlopeOfALine {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter x1: ");
        int xOne= input.nextInt();
        System.out.print("Enter y1: ");
        int yOne= input.nextInt();
        System.out.print("Enter x2: ");
        int xTwo= input.nextInt();
        System.out.print("Enter y2: ");
        int yTwo= input.nextInt();
        System.out.print("The line defined by the points ("+xOne+","+yOne+") and ("+xTwo+","+yTwo+") ");
        if (xOne==xTwo)
            System.out.print("is a vertical line and the slope is undefined.");
        else
            System.out.print("has a slope of "+(double)(yTwo-yOne)/(xTwo-xOne));
    }
}
