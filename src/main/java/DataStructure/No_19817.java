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
        int salaryGap = 0;
        int employers = 0;
        int employerNum;
        int salary;
        int sum = 0;


        int company = Integer.parseInt(bufferedReader.readLine());

        for (employerNum = 0; employerNum < company; employerNum++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            employers = Integer.parseInt(stringTokenizer.nextToken());

            for (salary = 0; salary < employers; salary++) {
                pq.offer(Integer.parseInt(stringTokenizer.nextToken()));
            }
        }
        maxEmployees = pq.peek();

        for (employerNum = 0; employerNum < company; employerNum++) {
            for (salary = 0; salary < employers; salary++) {
                pq.poll();
            }
            salaryGap = (maxEmployees - pq.peek()) * employers;
            sum += salaryGap;
        }

        System.out.println(sum);
    }
}
