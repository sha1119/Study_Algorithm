package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No_16466_n {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> ticketing = new PriorityQueue<>();

        int N = Integer.parseInt(bufferedReader.readLine());
        int ticketNumber = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 0; i < N; i++) {
            ticketNumber = Integer.parseInt(stringTokenizer.nextToken());
            ticketing.offer(ticketNumber);
        }

        int count = 1;

        while (!ticketing.isEmpty()) {
            if (ticketing.peek() != count) {
                break;
            }
            else {
                ticketing.remove();
                count++;
            }
        }
        System.out.println(count);
    }
}