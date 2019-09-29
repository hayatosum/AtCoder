package abs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ABC081B {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int result = 0;
        int oddCount = 0;
        int div = 2;
        while (oddCount == 0) {
            for (int target : a) {
                if (0 < target % div) {
                    oddCount++;
                }
            }
            if (oddCount == 0) {
                result++;
                div = div * 2;
            }
        }

        System.out.println(result);
    }
}
