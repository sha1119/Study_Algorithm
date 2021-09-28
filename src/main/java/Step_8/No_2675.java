package Step_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            char[] test = stringTokenizer.nextToken().toCharArray();
            int length = test.length;

            for (int j = 0; j < length; j++) {
                for (int k =0; k < n; k++) {
                    stringBuilder.append(test[j]);
                }
            }

            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
    }
}
