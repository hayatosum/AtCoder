package abc115;

import java.util.Scanner;

public class ABC115A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next());

        String result = "Christmas";
        for (int i = 0; i < 25 - d; i++) {
            result += " Eve";
        }

        System.out.println(result);
    }
}