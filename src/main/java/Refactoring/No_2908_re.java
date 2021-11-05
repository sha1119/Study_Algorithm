package Refactoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class No_2908_re {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());

        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        if (A > B) {
            stack.push(A / 100);
            stack.push((A / 10) % 10);
            stack.push(A % 10);

            for (int i = 0; i < 3; i++) {
                answer = stack.pop();
            }
            stringBuilder.append(answer);
        } else if (A < B) {
            stack.push(B / 100);
            stack.push((B / 10) % 10);
            stack.push(B % 10);
            for (int i = 0; i < 3; i++) {
                answer = stack.pop();
            }
            stringBuilder.append(answer);
        }

        System.out.println(stringBuilder);
    }
}
