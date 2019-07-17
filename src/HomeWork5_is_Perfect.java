
public class HomeWork5_is_Perfect {
    public static void main(String[]args){
        HomeWork5_is_Perfect.isPerfect(1000000);//100.000 cycles: 1min 33 sec
    }

    public static void isPerfect(int number) {

        System.out.println("Perfect numbers at 1 up to " + number + ":");

        for (int i = 1; i < number; i++) {
            int res = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0)    {
                    res += j;
                }
            }
            if (res == i) {
                System.out.println(res);
            }
        }
    }
}

