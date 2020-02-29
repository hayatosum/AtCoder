package abc115;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC116B {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer s = Integer.parseInt(sc.next());

        // 主処理
        List<Integer> list = new ArrayList<>();
        list.add(s);

        int result = 0;
        for (int i = 0; true; i++) {
            s = s % 2 == 0 ? s / 2 : 3 * s + 1;
            if (list.contains(s)) {
                result = i + 2;
                break;
            } else {
                list.add(s);
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
