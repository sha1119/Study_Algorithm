package WTC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_5 {
    public static int solution(int number) {
        int count = 0;

        for (int i = 1; i < number + 1; i++) {
            String numberToString = String.valueOf(i);

            for (int j = 0; j < numberToString.length(); j++) {
                char clapChecker = numberToString.charAt(j);

                if (clapChecker == '3' || clapChecker == '6' || clapChecker == '9') {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());
        int clap = solution(number);

        System.out.println(clap);
    }
}