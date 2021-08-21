package Step_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
