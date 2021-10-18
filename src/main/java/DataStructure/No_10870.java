package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        System.out.println(Fibonacci(N));
    }

    public static int Fibonacci(int fx) {
        if (fx == 0) {
            return 0;
        }

        if (fx == 1 || fx == 2) {
            return 1;
        } else {
            return Fibonacci(fx - 1) + Fibonacci(fx - 2);
        }
    }
}