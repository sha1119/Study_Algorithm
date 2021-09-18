package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_23037_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        int makeFive = 0;
        int sum = 0;
        int result = 0;

        for (int i = 0; i < a.length(); i++) {
            makeFive = a.charAt(i) - '0';
            result = (int) Math.pow(makeFive, 5);
            sum += result;
        }

        System.out.println(sum);
    }
}
