import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        double digits[] = {-7.0, 17.0, 1.0, -8.0, 5.0, 6.0, -2.0, 3.0, 12.0, -7.0, 8.0, 14.0, -11.0, 15.0, -6.0};
        double result = 0;

        for (double m : digits) {
            if (m > 0) {
                sum++;
                result = result + m;
            }
        }
        System.out.println(result + "/" + sum + "=" + result / sum);
        main2();
    }

    public static void main2() {
        int array[] = {6, 8, -2, 2 ,-4, 3};
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


