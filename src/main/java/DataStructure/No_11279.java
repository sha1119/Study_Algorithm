package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class No_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(bufferedReader.readLine());
            if (input == 0) {
                if (pq.isEmpty()) {
                    stringBuilder.append(0).append('\n');
                } else {
                    stringBuilder.append(pq.poll()).append('\n');
                }
            } else {
                pq.offer(input);
            }
        }

        System.out.println(stringBuilder);
    }
}