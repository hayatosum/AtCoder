package abc140;

import java.util.Scanner;

public class ABC143A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        int result = a - (b * 2);
        if (result <= 0) {
            result = 0;
        }

        System.out.println(result);
    }
}
