import java.io.InputStream;
import java.util.Scanner;

public class ClassWork1 {
    public static void main(String[] args) {
        InputStream stream = System.in;
        Scanner in = new Scanner(stream);
        int num = in.nextInt();
        int res = 0;
        int i = 0;

        while (i <= num) {
            res = res + i;
            ++i;
        }
        System.out.println("the sum of numbers from 1 to " +  num + " is " + res);
    }
}
