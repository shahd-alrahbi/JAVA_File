import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr = new int [] {5, 2, 3, 1};
        int temp = 0;
        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
//                using swap for array
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // elements after sorting
        System.out.println("array after sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }
