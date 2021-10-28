package Practice02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No_10845 {
    public static PriorityQueue<Integer> pq = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        int x = 0;
        for (int i = 0; i < N; i++) {
            String command = bufferedReader.readLine();

            if (command.contains("push")) {
                stringTokenizer = new StringTokenizer(command);
                stringTokenizer.nextToken();
                int X = Integer.parseInt(stringTokenizer.nextToken());
                pq.offer(X);
                x = X;
            } else if (command.equals("pop")) {
                if (pq.isEmpty()) {
                    stringBuilder.append(-1).append('\n');
                } else {
                    pq.poll();
                }
            } else if (command.contains("size")) {
                stringBuilder.append(pq.size()).append('\n');
            } else if (command.contains("empty")) {
                if (pq.isEmpty()) {
                    stringBuilder.append(1).append('\n');
                } else {
                    stringBuilder.append(0).append('\n');
                }
            } else if (command.contains("front")) {
                if (pq.isEmpty()) {
                    stringBuilder.append(-1).append('\n');
                } else {
                    stringBuilder.append(pq.poll()).append('\n');
                }
            } else if (command.contains("back")) {
                if (pq.isEmpty()) {
                    stringBuilder.append(-1).append('\n');
                } else {
                    stringBuilder.append(pq.peek()).append('\n');
                }
            }
        }

        System.out.println(stringBuilder);
    }
}