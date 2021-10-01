package Step_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());

        int x = 0;
        for (int i = 0; i <= a; i++) {
            x += i;
        }
        System.out.println(x);
    }
}
