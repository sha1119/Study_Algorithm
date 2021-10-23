package Practice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No_23246 {
    private static class Calculate implements Comparable<Calculate> {
        int backNumber;
        int multiple;
        int plus;

        private Calculate(int backNumber, int multiple, int plus) {
            this.backNumber = backNumber;
            this.multiple = multiple;
            this.plus = plus;
        }

        @Override
        public int compareTo(Calculate other) {
            if (this.multiple == other.multiple) {
                if (this.plus == other.plus) {
                    return this.backNumber < other.backNumber ? -1 : 1;
                } else {
                    return this.plus < other.plus ? -1 : 1;
                }
            } else {
                return this.multiple < other.multiple ? -1 : 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Calculate> pq = new PriorityQueue<>();
        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine());
        int b = 0;

        StringTokenizer stringTokenizer;
        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            b = Integer.parseInt(stringTokenizer.nextToken());
            int p = Integer.parseInt(stringTokenizer.nextToken());
            int q = Integer.parseInt(stringTokenizer.nextToken());
            int r = Integer.parseInt(stringTokenizer.nextToken());

            pq.offer(new Calculate(b, p * q * r, p + q + r));
        }

        for (int i = 0; i < 3; i++) {
            stringBuilder.append(pq.poll().backNumber).append(" ");
        }

        System.out.print(stringBuilder);
    }
}