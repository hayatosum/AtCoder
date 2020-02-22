package kupc2019;

import java.util.Arrays;
import java.util.Scanner;

public class KUPC2019A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(a);
        int max = a[n - 1];

        int result = 0;
        for (int num : a) {
            if (num + x >= max) {
                result++;
            }
        }

        System.out.println(result);

        sc.close();
    }
}