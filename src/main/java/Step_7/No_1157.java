package Step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];
        String A = br.readLine();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= 'a' && A.charAt(i) <= 'z') {
                alphabet[A.charAt(i) - 97]++;
            }
            else {
                alphabet[A.charAt(i) - 65]++;
            }
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i <26; i++) {

            if (alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i + 65);
            }
            else if (alphabet[i] == max) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }
}
