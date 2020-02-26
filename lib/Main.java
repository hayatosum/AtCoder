package lib;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Integer n = Integer.parseInt(sc.next());
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        // 主処理

        int result = 0;

        // 出力
        System.out.println(result);
        sc.close();
    }
}
