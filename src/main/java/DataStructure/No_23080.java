package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_23080 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int K = Integer.parseInt(bufferedReader.readLine());
        String password = bufferedReader.readLine();

        for (int i = 0; i < password.length(); i += K) {
            stringBuilder.append(password.charAt(i));
        }

        System.out.println(stringBuilder);
    }
}