package abc150;

import java.util.Scanner;

public class ABC152A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        String result = n == m ? "Yes" : "No";
        System.out.println(result);

        sc.close();
    }
}
