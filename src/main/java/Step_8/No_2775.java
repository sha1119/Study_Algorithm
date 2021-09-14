package Step_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2775 {

    public static int[][] apart = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        countResident();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(apart[k][n]).append('\n');
        }
        System.out.println(sb);
    }

    public static void countResident() {
        for (int i = 0; i < 15; i++) {
            apart[i][0] = 1;
            apart[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {

            for (int j = 2; j < 15; j++) {
                apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
            }
        }
    }
}
