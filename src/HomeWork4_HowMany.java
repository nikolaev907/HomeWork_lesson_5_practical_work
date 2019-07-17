import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4_HowMany {
    public static void main(String[] args) {
                            /* Вариант 1 */
        Scanner in = new Scanner(System.in);

        var arr = Arrays.stream(in.nextLine().split(" ")).toArray();
        int j = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].toString().isBlank()) continue;
            j++;
        }

        System.out.print("Number of worlds is " + j);

                            /* Вариант 2 */
//        int j = 0;

//        while (in.hasNext()) {
//             String[]  arrInput = in.nextLine().split(" ");
//
//            for (int i = 0; i < arrInput.length; i++) {
//                if (arrInput[i].isBlank()) {
//                    continue;
//                }
//                j++;
//            }
//
//            System.out.print("Number of worlds is " + j);
//        }

        in.close();

    }
}
