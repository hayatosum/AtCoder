package abc110;

import java.util.Scanner;

public class ABC111A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        s = s.replace("1", "x");
        s = s.replace("9", "1");
        s = s.replace("x", "9");

        System.out.println(s);

        sc.close();
    }
}