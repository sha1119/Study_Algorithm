package Refactoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No_10818_re {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        ArrayList<Integer> number = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++){
            number.add(Integer.valueOf(stringTokenizer.nextToken()));
        }

        number.sort(Comparator.naturalOrder());
        stringBuilder.append(number.get(0)).append(" ").append(number.get(N - 1));

        System.out.println(stringBuilder);
    }
}