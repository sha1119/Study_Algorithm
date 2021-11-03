package Step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        String str;
        for (int i = 0; i < T; i++) {
            str = bufferedReader.readLine();
            int sum = 0;
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }

            System.out.println(sum);
        }

    }
}