package abc135;

import java.util.Scanner;

public class ABC135A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a - b) % 2 == 0) {
            System.out.println((Math.abs(a) + Math.abs(b)) / 2);
        } else {
            System.out.println("IMPOSSIBLE");
        }

        sc.close();
    }
}
