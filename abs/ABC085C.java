import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();

        boolean flg = true;
        for (int i = 0; i <= n && flg; i++) {
            for (int j = 0; j <= n - i && flg; j++) {
                for (int k = 0; k <= n - i - j && flg; k++) {
                    if ((i + j + k == n) && ((10000 * i) + (5000 * j) + (1000 * k) == y)) {
                        System.out.println(i + " " + j + " " + k);
                        flg = false;
                    }
                }
            }
        }

        if (flg) {
            System.out.println("-1 -1 -1");
        }
    }
}
