package abc132;

import java.util.Scanner;

public class ABC132B {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] p = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 1; i < n - 1; i++) {
            if (Math.max(p[i-1], p[i+1]) >= p[i] && Math.min(p[i-1], p[i+1]) <= p[i]) {
                result++;
            }
        }

        System.out.println(result);
    }
}
