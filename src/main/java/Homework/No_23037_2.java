package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_23037_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        int makeFive = 0;
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            int result = 1;
            makeFive = a.charAt(i) - '0';
            System.out.println("makeFive: "+makeFive);

            for (int j = 0; j < 5; j++) {
                result *= makeFive;
                System.out.println("result: "+result+" /result*makeFive: "+(result*makeFive));
            }

            sum += result;
        }

        System.out.println(sum);
    }
}