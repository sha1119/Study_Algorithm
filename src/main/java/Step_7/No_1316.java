package Step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1316 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() throws IOException {
        boolean[] check = new boolean[26];
        int X = 0;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (X != now) {

                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    X = now;
                }

                else {
                    return false;
                }
            }

            else {
                continue;
            }
        }

        return true;
    }
}
