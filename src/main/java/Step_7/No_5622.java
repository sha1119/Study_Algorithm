package Step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dial = br.readLine();
        char[] chars = dial.toCharArray();
        int sum = 0;

        for (char N : chars) {
            if (N >= 'A' && N <= 'C') {
                sum += 3;
            }

            else if (N >= 'D' && N <= 'F') {
                sum += 4;
            }

            else if (N >= 'G' && N <= 'I') {
                sum += 5;
            }

            else if (N >= 'J' && N <= 'L') {
                sum += 6;
            }

            else if (N >= 'M' && N <= 'O') {
                sum += 7;
            }

            else if (N >= 'P' && N <= 'S') {
                sum += 8;
            }

            else if (N >= 'T' && N <= 'V') {
                sum += 9;
            }

            else if (N >= 'W' && N <= 'Z') {
                sum += 10;
            }

        }

        System.out.println(sum);
    }
}
