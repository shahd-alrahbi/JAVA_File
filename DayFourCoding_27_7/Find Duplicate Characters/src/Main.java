import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Activity to find duplicate char
        Scanner read=new Scanner(System.in);
        System.out.println("Pleas enter a word");
        String word=read.next();
        char[] c = word.toCharArray();
        System.out.println("The Duplicate Characters is :");
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (c[i] == c[j]) {

                    System.out.print(c[j] + " ");
                    break;
                }
            }
    }
    }
}