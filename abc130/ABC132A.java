package abc130;

import java.util.Arrays;
import java.util.Scanner;

public class ABC132A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] arrS = s.split("");
        Arrays.sort(arrS);

        boolean result = arrS[0].equals(arrS[1]) && arrS[2].equals(arrS[3]) && !arrS[0].equals(arrS[2]);

        System.out.println(result ? "Yes" : "No");

        sc.close();
    }
}
