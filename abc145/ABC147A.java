package abc145;

import java.util.Scanner;

public class ABC147A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a1 = Integer.parseInt(sc.next());
        int a2 = Integer.parseInt(sc.next());
        int a3 = Integer.parseInt(sc.next());

        boolean judge = 22 <= (a1 + a2 + a3);
        if (judge) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }

        sc.close();
    }
}
