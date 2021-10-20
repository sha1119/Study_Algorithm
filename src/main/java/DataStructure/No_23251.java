package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_23251 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());
        int N = 0;

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(bufferedReader.readLine());

            stringBuilder.append(23 * N).append('\n');
        }

        System.out.println(stringBuilder);
    }
}
