package abc139;

import java.util.Scanner;

public class ABC139A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String[] arrS = s.split("");
        String[] arrT = t.split("");

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arrS[i].equals(arrT[i])) {
                result++;
            }
        }

        System.out.println(result);
    }
}
