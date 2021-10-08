package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No_3077 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        HashMap<String, Integer> ANSWER = new HashMap<>(); // ANSWER
        int count = 0;

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        //ANSWER
        for (int sequence = 0; sequence < N; sequence++) {
            ANSWER.put(stringTokenizer.nextToken(), sequence);
        }

        //REPORTED
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String[] REPORTED = new String[N]; // SOLUTION

        for (int i = 0; i < N; i++) {
            REPORTED[i] = stringTokenizer.nextToken();
        }

        //COMPARE & COUNT
        for (int current = 0; current < REPORTED.length; current++) {
            for (int next = current + 1; next < REPORTED.length; next++) {
                int seq1 = ANSWER.get(REPORTED[current]);
                int seq2 = ANSWER.get(REPORTED[next]);

                if (seq1 > seq2) continue;
                count++;
            }
        }

        stringBuilder.append(count).append("/").append((N * (N - 1) / 2));

        System.out.println(stringBuilder);
    }
}