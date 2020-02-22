package abs;

import java.util.Scanner;

public class ABC083B {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            String[] str = Integer.toString(i).split("");
            int sum = 0;
            for (String target : str) {
                sum += Integer.parseInt(target);
            }
            if (a <= sum && sum <= b) {
                result += i;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
