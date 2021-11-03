package Refactoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10809_re {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int[] alphabetChecker = new int[26];

        for (int i = 0; i < alphabetChecker.length; i++) {
            alphabetChecker[i] = -1;
        }

        String S = bufferedReader.readLine();

        for (int i = 0; i < S.length(); i++) {
            char SToChar = S.charAt(i);

            if (alphabetChecker[SToChar - 'a'] == -1) {
                alphabetChecker[SToChar - 'a'] = i;
            }
        }

        for (int answer : alphabetChecker) {
            stringBuilder.append(answer).append(" ");
        }

        System.out.println(stringBuilder);
    }
}