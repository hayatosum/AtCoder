package abc045;

import java.util.Arrays;
import java.util.Scanner;

public class ABC047A {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = {a, b, c};
        Arrays.sort(arr);
        boolean result = arr[0] + arr[1] == arr[2];

        System.out.println(result ? "Yes" : "No");

        sc.close();
    }
}
