package abc110;

import java.util.Scanner;

public class ABC112A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        if (n == 1) {
            System.out.println("Hello World");

        } else {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            System.out.println(a + b);
        }

        sc.close();
    }
}