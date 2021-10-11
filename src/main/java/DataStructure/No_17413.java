package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input = bufferedReader.readLine();
        StringBuilder result = new StringBuilder();
        boolean check = false;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '<') {
                check = true;
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append(input.charAt(i));
            } else if (input.charAt(i) == '>') {
                check = false;
                result.append(input.charAt(i));
            } else if (input.charAt(i) == ' ') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append(input.charAt(i));
            } else {
                if (check) {
                    result.append(input.charAt(i));
                } else {
                    stack.push(input.charAt(i));
                }
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println(result);
    }
}