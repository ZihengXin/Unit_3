// 10/30 Charly. This program should be able to tell you how much money you will need to buy cookies.
import java.util.Scanner;

public class CookieOrders {
    public static void main(String[] args){
        System.out.println("1-4 boxes:\t\t\t\t6.95 per box\n" +
                "5-9 boxes:\t\t\t\t5.95 per box\n" +
                "10-15 boxes:\t\t\t5.50 per box\n" +
                "16 or more boxes:\t\t4.95 per box");
        System.out.println("Enter the number of boxes you wish to purchase: ");
        Scanner input= new Scanner(System.in);
        int boxNum= input.nextInt();
        System.out.print(totalCost(boxNum));
    }
    public static String totalCost(int a){
        if (a > 0 && a <= 4) {
            double totalBill = 6.95 * a;
            return "You bought "+a+" boxes of cookies at $6.95 per box. Your total bill is $"+totalBill;
        }
        else if (a >= 5 && a <= 9) {
            double totalBill = 5.95 * a;
            return "You bought "+a+" boxes of cookies at $5.95 per box. Your total bill is $"+totalBill;
        }
        else if (a >= 10 && a <= 15) {
            double totalBill = 5.50 * a;
            return "You bought "+a+" boxes of cookies at $5.50 per box. Your total bill is $"+totalBill;
        }
        else if (a >= 16) {
            double totalBill = 4.95 * a;
            return "You bought "+a+" boxes of cookies at $4.95 per box. Your total bill is $"+totalBill;
        }
        else {
            return "Your input is invalid";
        }
    }
}
