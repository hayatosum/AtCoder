package abc120;

import java.util.Scanner;

public class ABC122A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String b = sc.next();

        String result = "A";
        if ("A".equals(b)) {
            result = "T";
        } else if ("C".equals(b)) {
            result = "G";
        } else if ("G".equals(b)) {
            result = "C";
        }

        System.out.println(result);

        sc.close();
    }
}