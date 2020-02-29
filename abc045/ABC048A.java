package abc045;

import java.util.Scanner;

public class ABC048A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        sc.next(); // 未使用となる入力値"AtCoder"
        String s = sc.next();
        sc.next(); // 未使用となる入力値"Contest"

        System.out.println("A" + s.charAt(0) + "C");

        sc.close();
    }
}
