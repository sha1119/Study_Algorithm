package Step_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int r1 = Integer.parseInt(stringTokenizer.nextToken());

            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            int r2 = Integer.parseInt(stringTokenizer.nextToken());

            stringBuilder.append(locate(x1, y1, r1, x2, y2, r2)).append('\n');
        }

        System.out.println(stringBuilder);
    }

    public static int locate(int x1, int y1, int r1, int x2, int y2, int r2) {

        int middlePoint = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        } else if (middlePoint > Math.pow(r1 + r2, 2)) {
            return 0;
        } else if (middlePoint < Math.pow(r2 - r1, 2)) {
            return 0;
        } else if (middlePoint == Math.pow(r2 - r1, 2)) {
            return 1;
        } else if (middlePoint == Math.pow(r1 + r2, 2)) {
            return 1;
        } else {
            return 2;
        }
    }
}
