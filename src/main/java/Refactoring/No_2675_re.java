package Refactoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2675_re {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());

        char ch;
        StringTokenizer stringTokenizer;
        for (int i = 0; i < T; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int R = Integer.parseInt(stringTokenizer.nextToken());
            String S = stringTokenizer.nextToken();
            for (int j = 0; j < S.length(); j++) {
                ch = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    stringBuilder.append(ch);
                }
            }
            stringBuilder.append('\n');
        }

        System.out.println(stringBuilder);
    }
}