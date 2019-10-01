package abs;

import java.util.Scanner;

public class ABC087B {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 500円の枚数
        int b = sc.nextInt(); // 100円の枚数
        int c = sc.nextInt(); // 50円の枚数
        int x = sc.nextInt(); // 合計金額

        int result = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    if ((500 * i) + (100 * j) + (50 * k) == x) {
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
