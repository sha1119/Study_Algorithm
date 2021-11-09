package Step_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int[][] deongChi = new int[N][2];

        String[] deongChiElement;
        for (int i = 0; i < N; i++) {
            deongChiElement = bufferedReader.readLine().split(" ");

            deongChi[i][0] = Integer.parseInt(deongChiElement[0]);
            deongChi[i][1] = Integer.parseInt(deongChiElement[1]);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int rank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }

                if (deongChi[i][0] < deongChi[j][0] && deongChi[i][1] < deongChi[j][1]) {
                    rank++;
                }
            }

            stringBuilder.append(rank).append(' ');
        }

        System.out.println(stringBuilder);
    }
}