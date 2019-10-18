// 10/18 Charly. This program is testing the function of == and !=
public class StringReferences {
    public static void main(String[] args){
        String word = "hello";
        String sentence = null;
        String str = "hello";
        System.out.println(word == sentence);
        System.out.println(sentence == null);
        System.out.println(word == str);
        System.out.println(word != null);
    }
}
