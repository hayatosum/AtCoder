package abc001;

import java.util.Scanner;

public class ABC001B {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        String result = "00";
        if (m > 70000) {
            result = "89";
        } else if (m >= 35000) {
            result = String.format("%02d", ((m - 30000) / 5 + 80000) / 1000);
        } else if (m >= 6000 && m <= 30000) {
            result = String.format("%02d", (m + 50000) / 1000);
        } else if (m >= 100 && m <= 5000) {
            result = String.format("%02d", m  / 100);
        }
        System.out.println(result);

        sc.close();
    }
}
