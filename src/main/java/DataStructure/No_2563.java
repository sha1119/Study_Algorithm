package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        boolean[][] coordinate = new boolean[100][100];
        int area = 0;

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());

            for (int width = x; width < x + 10; width++) {
                for (int height = y; height < y + 10; height++) {
                    // 흰색이면 칠하고 ++
                    if (coordinate[width][height] == false) {
                        coordinate[width][height] = true;

                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}