package abc130;

import java.util.Scanner;

public class ABC133A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = Math.min(a * n, b);

        System.out.println(result);
    }
}
