package Step_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 2; i < N; i++) {
            while (N % i == 0) {
                stringBuilder.append(i).append("\n");
                N /= i;
            }
        }

        if (N != 1) {
            stringBuilder.append(N);
        }

        System.out.println(stringBuilder);
    }
}
