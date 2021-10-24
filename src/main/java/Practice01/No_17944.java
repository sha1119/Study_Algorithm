package Practice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_17944 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int T = Integer.parseInt(stringTokenizer.nextToken());

        int answer = T % (4 * N - 2);

        if (answer <= 2 * N) {
            stringBuilder.append(answer);
        } else {
            stringBuilder.append(4 * N - answer);
        }

        System.out.println(stringBuilder);
    }
}