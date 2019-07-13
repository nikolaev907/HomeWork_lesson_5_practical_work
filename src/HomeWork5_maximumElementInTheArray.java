import java.util.Arrays;
import java.util.Scanner;

public class HomeWork5_maximumElementInTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = Arrays.stream(in.next().split(",")).mapToInt(Integer::parseInt).toArray();
        int max = arr[0];

        System.out.println("Enter numbers separated by commas: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximal value in array is " + max);

        in.close();
    }
}

