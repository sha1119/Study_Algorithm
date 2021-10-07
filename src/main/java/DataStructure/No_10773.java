package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int sum = 0;

        int K = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());

            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        while (true) {
            if (stack.isEmpty()) break;
            else sum += stack.pop();
        }

        System.out.println(sum);
    }
}