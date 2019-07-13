import java.util.Arrays;//
import java.util.Scanner;

public class ClassWork3 {
        public static int[] readArray() {
        Scanner scanner = new Scanner(System.in);
        return Arrays.stream(scanner.next().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) {


        int[] arr = readArray();
        int[] resArr = new int[arr.length];

        for (int i = 0, j = resArr.length - 1; i < arr.length && j >= 0; j--, i++) {
            resArr[j] = arr[i];
        }
        System.out.print(Arrays.toString(resArr));
    }
}









