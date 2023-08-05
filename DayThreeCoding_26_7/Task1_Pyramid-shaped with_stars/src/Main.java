import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//        System.out.print("Enter the number of rows: ");
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int s = 1; s <= 2 * i - 1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}