package Refactoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_11720_re {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        bufferedReader.readLine();
        String number = bufferedReader.readLine();
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i)- '0';
        }

        System.out.println(sum);
    }
}