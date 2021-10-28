package Practice02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        int x = 0;

        for (int i = 0; i < N; i++) {
            String command = bufferedReader.readLine();

            if (command.contains("push")) {
                stringTokenizer = new StringTokenizer(command);
                stringTokenizer.nextToken();
                int X = Integer.parseInt(stringTokenizer.nextToken());
                q.offer(X);
                x = X;
            } else if (command.equals("pop")) {
                if (q.isEmpty()) {
                    stringBuilder.append(-1).append('\n');
                } else {
                    stringBuilder.append(q.poll()).append('\n');
                }
            } else if (command.equals("size")) {
                stringBuilder.append(q.size()).append('\n');
            } else if (command.equals("empty")) {
                if (q.isEmpty()) {
                    stringBuilder.append(1).append('\n');
                } else {
                    stringBuilder.append(0).append('\n');
                }
            } else if (command.equals("front")) {
                if (q.isEmpty()) {
                    stringBuilder.append(-1).append('\n');
                } else {
                    stringBuilder.append(q.peek()).append('\n');
                }
            } else if (command.equals("back")) {
                if (q.isEmpty()) {
                    stringBuilder.append(-1).append('\n');
                } else {
                    stringBuilder.append(x).append('\n');
                }
            }
        }

        System.out.println(stringBuilder);
    }
}