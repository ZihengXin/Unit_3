// 10/30 Charly. This program should be able to roll two dies. One normal, while the other one is tricky.
public class TrickyDice {
    public static void main(String[] args){
        regularRoll();
        trickyRoll();
    }
    private static void regularRoll(){
        int normal = (int)(Math.random()*6)+1;
        System.out.println(normal);
    }
    private static void trickyRoll() {
        double tricky = (int) (Math.random() * 100) + 1;
        if (tricky< 16)
            System.out.println("1");
        else if (tricky< 28)
            System.out.println("2");
        else if (tricky< 39)
            System.out.println("3");
        else if (tricky< 57)
            System.out.println("4");
        else if (tricky< 73)
            System.out.println("5");
        else if (tricky>= 73)
            System.out.println("6");
    }
}
