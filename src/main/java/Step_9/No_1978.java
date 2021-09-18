package Step_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        int result = 0;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(stringTokenizer.nextToken());
            int count = 0;

            for (int j = 1; j <= X; j++) {
                if (X % j == 0)
                    count++;
            }

            if (count == 2) {
                result++;
            }
        }

        System.out.println(result);
    }
}