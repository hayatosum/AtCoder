package abs;

import java.util.Scanner;

public class ABC081B {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int result = 0;
        boolean isOdd = false;
        while (!isOdd) {
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    a[i] /= 2;
                } else {
                    isOdd = true;
                }
            }
            if (!isOdd) {
                result++;
            }
        }

        System.out.println(result);
    }
}
