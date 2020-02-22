package abc120;

import java.util.Scanner;

public class ABC124B {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] h = new Integer[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }

        int result = 1;
        int max = h[0];
        for (int i = 1; i < n; i++) {
            if (max <= h[i]) {
                result++;
            }
            max = Math.max(max, h[i]);
        }

        System.out.println(result);

        sc.close();
    }
}