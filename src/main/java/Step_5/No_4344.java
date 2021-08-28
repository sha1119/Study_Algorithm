package Step_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = countTotalStudents(st.nextToken());

            int sumScore = 0;
            int[] students = new int[N];
            double averageScore;
            double superiorStudent = 0;

            for (int j = 0; j < N; j++) {
                int score = Integer.parseInt(st.nextToken());

                sumScore += score;
                students[j] = score;
            }
            averageScore = countAverage(sumScore, N);

            for (int student : students) {
                if (student > averageScore) {
                    superiorStudent++;
                }
            }

            double result = (superiorStudent / N) * 100;
            sb.append(String.format("%.3f", result)).append("%").append("\n");
        }

        System.out.println(sb);
    }
    public static int countTotalStudents(String input) {
        return Integer.parseInt(input);
    }

    public static double countAverage(int sumScore, int N) {
        return (double) sumScore / N;
    }
}