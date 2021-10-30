package Practice02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class No_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Integer> input = new ArrayList<>();

        int N = Integer.parseInt(bufferedReader.readLine());

        double num = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            input.add(Integer.valueOf(bufferedReader.readLine()));
            num = input.get(i);

            sum += num;
        }

        stringBuilder.append(String.format("%.0f", (sum / N))).append('\n');

        Collections.sort(input);

        stringBuilder.append(input.get((N / 2))).append('\n');

        int[] index = new int[input.size() + 1];
        int max = Integer.MIN_VALUE;
        int mode = 0;

        for (int i = 0; i < input.size(); i++){
            index[input.get(i)]++;
        }

        for (int i = 0; i < input.size(); i++) {
            if (max < index[i]) {
                max = index[i];
                mode = i;
            }
        }
        stringBuilder.append(mode).append('\n');

        stringBuilder.append(input.get(N - 1) - input.get(0)).append('\n');

        System.out.println(stringBuilder);
    }
}
