package Step_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[] cardNum = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            cardNum[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int answer = 0;

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {

                    int sum = cardNum[i] + cardNum[j] + cardNum[k];

                    if (M == sum) {
                        answer = sum;
                        stringBuilder.append(answer);
                        break;
                    }

                    if (answer < sum && sum < M) {
                        answer = sum;
                        stringBuilder.append(answer);
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}