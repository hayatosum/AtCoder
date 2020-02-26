package abc150;

import java.util.Scanner;

public class ABC151B {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int sum = 0;
        for (int num : a) {
            sum += num;
        }

        int result = 0;

        if (sum / (n + 1) < m) {
            int ave = sum / a.length;
            int diff = m - ave;
            result = m + diff;
        }
        
        result = result < 0 || k < result ? -1 : result;

        System.out.println(result);

        sc.close();
    }
}
