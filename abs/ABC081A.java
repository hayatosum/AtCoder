package abs;

import java.util.Scanner;

public class ABC081A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int result = 0;
        for (char target : s.toCharArray()) {
            if (target == '1') {
                result++;
            }
        }

        System.out.println(result);
    }
}
