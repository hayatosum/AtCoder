package abc115;

import java.util.Scanner;

public class ABC118A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        int result = 0;
        if (b % a == 0) {
            result = a + b;
        } else {
            result = b - a;
        }

        System.out.println(result);

        sc.close();
    }
}