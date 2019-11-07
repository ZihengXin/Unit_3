// 11/6 Charly. This program allow users to play rock paper and scissors with the computer.
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        System.out.println("Please choose either rock, paper, or scissors.");
        String computer = getComputerChoice();
        String person = getUserChoice();
        System.out.println("You chose "+person+".");
        System.out.println("The computer chose "+computer+".");
        System.out.println(whoWins(computer,person));
    }
    public static String getUserChoice(){
        Scanner input = new Scanner(System.in);
        String person = input.next().toLowerCase();
        // This is getting the user's choice
        return person;
    }
    public static String getComputerChoice(){
        int num= (int)(Math.random()*3);
        // Here is how the computer get its choice
        if (num == 0)
            return "rock";
        else if (num == 1)
            return "paper";
        else
            return "scissors";
    }
    public static String whoWins(String computer, String person){
        String result;
        String computerWin = "The computer wins!";
        String personWin = "You win!";
        String tied = "You tied!";
        String accident = "You have entered invalid choice.";
        // This includes the situations that should never occur.
        if ((person. equals("scissors") && computer.equals("scissors"))
                ||(person. equals("rock") && computer. equals("rock"))
                ||(person. equals("paper") && computer. equals("paper")))
            result = tied;
        else if ((person. equals("scissors") && computer.equals("paper"))
                ||(person. equals("rock") && computer. equals("scissors"))
                ||(person. equals("paper") && computer. equals("rock")))
            result = personWin;
        else if ((person. equals("scissors") && computer.equals("rock"))
                ||(person. equals("rock") && computer. equals("paper"))
                ||(person. equals("paper") && computer. equals("scissors")))
        result = computerWin;
        else
            result = accident;
        // prepared for typo mistakes in the input.
        return result;
    }
}
