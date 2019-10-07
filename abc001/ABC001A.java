package abc001;

import java.util.Scanner;

public class ABC001A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int now = sc.nextInt();
        int ago = sc.nextInt();

        System.out.println(now - ago);
    }
}
