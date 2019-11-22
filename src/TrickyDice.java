// 11/22 Charly. This program should be able to roll two dies. One normal, while the other one is tricky.
// I changed the code to pass the test. 
public class TrickyDice {
    public static void main(String[] args){
        regularRoll();
        trickyRoll();
    }
    public static int regularRoll(){
        return (int)(Math.random()*6)+1;
    }
    public static int trickyRoll() {
        double tricky = (int) (Math.random() * 100) + 1;
        if (tricky< 16)
            return 1;
        else if (tricky< 28)
            return 2;
        else if (tricky< 39)
            return 3;
        else if (tricky< 57)
            return 4;
        else if (tricky< 73)
            return 5;
        else
            return 6;
    }
}
