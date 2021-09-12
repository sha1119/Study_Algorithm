package Step_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int crossCount = 1;
        int prevCountSum = 0;

        while(true) {
            if(N <= prevCountSum + crossCount) {
                if (crossCount % 2 == 1) {
                    System.out.print((crossCount - (N - prevCountSum - 1)) + "/" + (N - prevCountSum));
                    break;
                } else {
                    System.out.print((N - prevCountSum) + "/" + (crossCount - (N - prevCountSum - 1)));
                    break;
                }

            } else {
                prevCountSum += crossCount;
                crossCount++;
            }
        }

    }
}
