package abc135;

import java.util.Scanner;

public class ABC136A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = Math.max(c - (a - b), 0);

        System.out.println(result);

        sc.close();
    }
}
