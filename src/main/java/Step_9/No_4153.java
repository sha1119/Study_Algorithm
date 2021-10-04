package Step_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            int z = Integer.parseInt(stringTokenizer.nextToken());

            if (x == 0 && y == 0 && z == 0) break;

            if ((x * x + y * y) == z * z) {
                stringBuilder.append("right").append('\n');
            } else if (x * x == (y * y + z * z)) {
                stringBuilder.append("right").append('\n');
            } else if (y * y == (x * x + z * z)) {
                stringBuilder.append("right").append('\n');
            } else {
                stringBuilder.append("wrong").append('\n');
            }
        }

        System.out.println(stringBuilder);
    }
}