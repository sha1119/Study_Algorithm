package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int time = 0;

        for (int i = 0; i < 4; i++) {
            time += Integer.parseInt(bufferedReader.readLine());
        }

        int minute = time / 60;
        int second = time % 60;

        stringBuilder.append(minute).append('\n').append(second);
        System.out.println(stringBuilder);
    }
}
