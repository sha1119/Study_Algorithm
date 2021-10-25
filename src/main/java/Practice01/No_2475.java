package Practice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int result = 0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            result += (num * num);
        }

        System.out.println(result % 10);
    }
}