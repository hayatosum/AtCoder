package abc135;

import java.util.Scanner;

public class ABC139D {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        long result = 0;
        for (int i = 1; i < n; i++) {
            result += i;
        }

        System.out.println(result);

        sc.close();
    }
}
