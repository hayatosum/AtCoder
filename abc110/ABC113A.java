package abc110;

import java.util.Scanner;

public class ABC113A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        int result = x + y / 2;

        System.out.println(result);
    }
}