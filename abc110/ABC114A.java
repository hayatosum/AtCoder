package abc110;

import java.util.Scanner;

public class ABC114A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());

        boolean result = false;
        if (x == 7 || x == 5 || x == 3) {
            result = true;
        }

        System.out.println(result ? "YES" : "NO");
    }
}