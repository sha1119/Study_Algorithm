package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No_19817 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer stringTokenizer;
        int maxEmployees;
        int sum = 0;


        int company = Integer.parseInt(bufferedReader.readLine());

        for (int employerNum = 0; employerNum < company; employerNum++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int employers = Integer.parseInt(stringTokenizer.nextToken());

            for (int salary = 0; salary < employers; salary++) {
                pq.offer(Integer.parseInt(stringTokenizer.nextToken()));
            }

            maxEmployees = pq.poll();

            sum += (maxEmployees - pq.poll()) * employerNum;
        }
        System.out.println(sum);
    }
}
