package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            stringBuilder.append(check(bufferedReader.readLine())).append('\n');
        }

        System.out.println(stringBuilder);
    }

    public static String check(String example) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < example.length(); i++) {
            char parenthesis = example.charAt(i);

            if (parenthesis == '(') {
                stack.push(parenthesis);
            }

            else if (stack.empty()) {
                return "NO";
            }

            else {
                stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES";
        }

        else {
            return "NO";
        }
    }
}
