package abc150;

import java.util.Scanner;

public class ABC150A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        String result = x <= 500 * k ? "Yes" : "No";
        System.out.println(result);

        sc.close();
    }
}
