// 10/29 Charly. This program should take  the first and last name of a user, and generate its email address.
// But I am not sure if this return method is what you expect.
import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {
        System.out.println("Enter your First and Last name: ");
        Scanner input= new Scanner(System.in);
        String name= input.nextLine();
        int space= name.indexOf(" ");
        String firstName= name.substring(0,space);
        String lastName= name.substring(space+1);
        System.out.print("This user’s e-mail is: ");
        EmailGenerator.makeUserName(firstName,lastName);
        EmailGenerator.makeEmail(firstName);
    }
    public static String makeUserName(String firstName,String lastName){
        String UserName= (firstName.substring(0,1)).toLowerCase()+lastName.toLowerCase();
        System.out.print(UserName);
        return UserName;
    }
    public static String makeEmail(String Username){
        String email= "@ssfs.org";
        System.out.print(email);
        return email;
    }
}
