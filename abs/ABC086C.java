package abs;

import java.util.Scanner;

public class ABC086C {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] t = new Integer[n];
        Integer[] x = new Integer[n];
        Integer[] y = new Integer[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean result = true;
        int[] preLocation = new int[3];
        for (int i = 0; i < n && result; i++) {
            int now = t[i] - preLocation[0];
            int moveX = Math.abs(x[i] - preLocation[1]);
            int moveY = Math.abs(y[i] - preLocation[2]);
            result = now % ( moveX + moveY) == 0;
            preLocation[0] = t[i];
            preLocation[1] = x[i];
            preLocation[2] = y[i];
        }

        System.out.println(result ? "Yes" : "No");
    }
}
