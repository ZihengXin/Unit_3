// 10/29 Charly. This program should be able to tell if the two values have a common number. 
public class ShareDigit {
    public static void main(String[] args) {
        System.out.println(ShareDigit(18, 79));
    }

    public static boolean ShareDigit(int one, int two) {
        int firstTen = one / 10;
        int firstOne = one % 10;
        int secondTen = two / 10;
        int secondOne = two % 10;
        if (firstTen == secondTen)
            return true;
        else if (firstOne == secondOne)
            return true;
        else if (firstOne == secondTen)
            return true;
        else if (firstTen == secondTen)
            return true;
        else
            return false;
    }
}