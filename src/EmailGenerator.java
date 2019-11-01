// 11/1 Charly. This program should take  the first and last name of a user, and generate its email address.
import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {
        System.out.println("Enter your First and Last name: ");
        // Please enter the first name and last name in the same line.
        Scanner input= new Scanner(System.in);
        String name= input.nextLine();
        int space= name.indexOf(" ");
        String firstName= name.substring(0,space);
        String lastName= name.substring(space+1);
        System.out.print("This user’s e-mail is: ");
        String part1= EmailGenerator.makeUserName(firstName,lastName);
        String part2= EmailGenerator.makeEmail();
        System.out.print(part1+part2);
    }
    public static String makeUserName(String firstName,String lastName){
        String UserName= (firstName.substring(0,1)).toLowerCase()+lastName.toLowerCase();
        return UserName;
    }
    public static String makeEmail(){
        String email= "@ssfs.org";
        return email ;
    }
}
