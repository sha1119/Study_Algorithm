package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int factorialNum = 1;

        while (N != 0) {
            factorialNum = factorialNum * N;
            N--;
        }

        System.out.println(factorialNum);
    }
}