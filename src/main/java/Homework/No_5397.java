package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            stringBuilder.append(keyLogger(bufferedReader.readLine())).append('\n');
        }

        System.out.println(stringBuilder);
    }

    public static String keyLogger(String inputPassword) {
        Stack<Character> passwordStack = new Stack<>();
        Stack<Character> garbageStack = new Stack<>();

        char popValue = passwordStack.pop();

        for (int i = 0; i < inputPassword.length(); i++) {
            char input = inputPassword.charAt(i);

            if (input == '<') {
                garbageStack.push(input);
                passwordStack.pop();
            }

            else if (input == '>') {
                garbageStack.push(input);
                passwordStack.push(popValue);
                passwordStack.push(input);
            }

            else if (input == '-') {
                garbageStack.push(input);
                passwordStack.pop();
                passwordStack.remove(popValue);
            }

            else {
                passwordStack.push(input);
                passwordStack.push(popValue);
            }
        }

        while (!passwordStack.empty()) {
            passwordStack.pop();
        }

        return inputPassword;
    }
}
