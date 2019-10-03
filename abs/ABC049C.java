package abs;

import java.util.Scanner;

public class ABC049C {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        s = s.replace("eraser", "")
                .replace("erase", "")
                .replace("dreamer", "")
                .replace("dream", "");

        if (s.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
