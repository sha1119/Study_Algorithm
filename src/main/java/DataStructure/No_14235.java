package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No_14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine());
        PriorityQueue<Integer> present = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer stringTokenizer;

        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int input = Integer.parseInt(stringTokenizer.nextToken());

            if (input == 0) {
                if (present.isEmpty()) {
                    stringBuilder.append(-1).append('\n');
                } else {
                    stringBuilder.append(present.poll()).append('\n');
                }
            } else {
                for (int j = 0; j < input; j++) {
                    present.offer(Integer.parseInt(stringTokenizer.nextToken()));
                }
            }
        }

        System.out.println(stringBuilder);
    }
}