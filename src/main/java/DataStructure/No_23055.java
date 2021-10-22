package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_23055 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    stringBuilder.append("*");
                    continue;
                }

                if (j == i || N - j - 1 == i) {
                    stringBuilder.append("*");
                } else {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append('\n');
        }

        System.out.println(stringBuilder);
    }
}