package abc155;

import java.util.Scanner;

public class ABC157A {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // 主処理
        int result = (int) Math.ceil(n / 2.0);

        // 出力
        System.out.println(result);
        sc.close();
    }
}