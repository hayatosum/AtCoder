package abc137;

import java.util.Scanner;

public class ABC137A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.max(Math.max(a + b, a - b), a * b));
    }
}
