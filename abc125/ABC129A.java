package abc125;

import java.util.Scanner;

public class ABC129A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());

        int result = Math.min(Math.min(p + q, q + r), p + r);

        System.out.println(result);

        sc.close();
    }
}
