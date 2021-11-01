package WTC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No_1 {
    public static int[] solution(int money) {
        int[] bill = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] billCount = new int[9];

        for (int i = 0; i < bill.length; i++) {
            if (i == 0) {
                billCount[i] = (money / bill[i]);
            } else {
                billCount[i] = (money % bill[i - 1]) / bill[i];
            }
        }

        return billCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(bufferedReader.readLine());
        int[] answer = solution(money);

        System.out.println(Arrays.toString(answer));
    }
}