import java.util.Arrays;
import java.util.Scanner;

public class HomeWork5_maximumElementInTheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = Arrays.stream(in.next().split(",")).mapToInt(Integer::parseInt).toArray();
        int max = array[0];

        System.out.println("Enter numbers separated by commas: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Maximal value in array is " + max);

        in.close();
    }
}

