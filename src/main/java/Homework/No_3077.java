package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No_3077 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(bufferedReader.readLine());

        HashMap<String, Integer> hashMap = new HashMap<>(); // ANSWER
        String[] answer = new String[N]; // SOLUTION
        int count = 0;

        //INPUT ANSWER
        for (int i = 0; i < N; i++) {
            hashMap.put(stringTokenizer.nextToken(), i);
        }

        //INPUT SOLUTION
        for (int i = 0; i < N; i++) {
            answer[i] = stringTokenizer.nextToken();
        }

        //COMPARE & COUNT
        for (int i = 0; i < N - 1; i++) {

            for (int j = i + 1; j < N; j++) {

                if (hashMap.get(answer[i]) < hashMap.get(answer[j])) {
                    count++;
                }
            }
        }

        stringBuilder.append(count).append("/").append(N * (N - 1) / 2);

        System.out.println(stringBuilder);
    }
}