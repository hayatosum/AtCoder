package abc135;

import java.util.Scanner;

public class ABC139B {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = 1;
        int result = 0;
        while (x < b) {
            x += (a - 1);
            result++;
        }

        System.out.println(result);

        sc.close();
    }
}
