package abc140;

import java.util.Scanner;

public class ABC141A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if ("Sunny".equals(s)) {
            System.out.println("Cloudy");

        } else if ("Cloudy".equals(s)) {
            System.out.println("Rainy");

        } else {
            System.out.println("Sunny");

        }
    }
}
