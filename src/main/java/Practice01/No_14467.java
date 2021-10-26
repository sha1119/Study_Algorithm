package Practice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No_14467 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer stringTokenizer;
        HashMap<Integer, Integer> observer = new HashMap<>();

        int answer = 0;
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int cowNum = Integer.parseInt(stringTokenizer.nextToken());
            int location = Integer.parseInt(stringTokenizer.nextToken());

            if (!observer.containsKey(cowNum)) {
                observer.put(cowNum, location);
            } else {
                int locationTracking = observer.get(cowNum);
                if (locationTracking != location) {
                    answer++;
                    observer.put(cowNum, location);
                }
            }
        }

        System.out.println(answer);
    }
}