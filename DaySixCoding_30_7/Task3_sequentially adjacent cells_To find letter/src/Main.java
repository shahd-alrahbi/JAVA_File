import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        3 - Problem: Given a 2D board and a word, find if the word exists in the grid.
//        The word can be constructed from letters of sequentially adjacent cells, where "adjacent"
//        cells are horizontally or vertically neighboring. The same letter cell may not be used more than
//        once.
//                Example:
//        Input:
//        board = [
//['A','B','C','E'],
//['S','F','C','S'],
//['A','D','E','E']
//]
//        word = "ABCCED"
//        Output: true
        Scanner read = new Scanner(System.in);
        char[][] chars = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println("Enter the word");
        String word = read.next();
        //String word = "ABCCED";
        //عشان اقسم الكلمات الي حروف
        char[] cs = word.toCharArray();
        boolean isThisWordValid = true;
        //ستخدمنا فور ايتش foreach
        for (char c : cs) {
            System.out.println(c + " : " + isExist(c, chars));
            //ستخدما فور لوب
            if (!isExist(c, chars)) {
                isThisWordValid = false;
                break;
            }
        }
        System.out.println("This word is " + isThisWordValid);
    }
    static boolean isExist( char c, char[][]chars){
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                if ( c == chars[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }


}

