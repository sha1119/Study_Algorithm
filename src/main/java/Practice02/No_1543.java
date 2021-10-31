package Practice02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String document = bufferedReader.readLine();
        String finder = bufferedReader.readLine();

        int count = 0;

        for (int i = 0; i < document.length() - finder.length() + 1; i++) {
            if (document.substring(i, i + finder.length()).equals(finder)) {
                count++;
                i += finder.length() - 1;
            }
        }

        System.out.println(count);
    }
}