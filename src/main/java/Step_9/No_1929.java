package Step_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1929 {
    public static boolean[] primeNumber;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        int M = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        primeNumber = new boolean[N + 1];
        getPrimeNumber();

        for (int i = M; i <= N; i++) {
            if (!primeNumber[i]) {
                stringBuilder.append(i + "\n");
            }
        }

        System.out.println(stringBuilder);
    }

    public static void getPrimeNumber() {
        primeNumber[1] = true;

        for (int i = 2; i < primeNumber.length; i++) {
            for (int j = 2; i * j < primeNumber.length; j++) {
                primeNumber[i * j] = true;
            }
        }
    }
}
