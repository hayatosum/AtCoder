package abc125;

import java.util.Arrays;
import java.util.Scanner;

public class ABC127C {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        Integer m = Integer.parseInt(sc.next());
        Integer[] l = new Integer[m];
        Integer[] r = new Integer[m];
        for (int i = 0; i < m; i++) {
            l[i] = Integer.parseInt(sc.next());
            r[i] = Integer.parseInt(sc.next());
        }

        // 主処理
        Arrays.sort(l);
        Arrays.sort(r);

        int min = l[m - 1];
        int max = r[0];

        int result = Math.max(Math.min(max - min + 1, n), 0);

        // 出力
        System.out.println(result);
        sc.close();
    }
}