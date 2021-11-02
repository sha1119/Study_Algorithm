package Refactoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_11654_re {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String alphabet = bufferedReader.readLine();
        char alphabetToChar = 0;
        for (int i = 0; i < alphabet.length(); i++) {
            alphabetToChar = alphabet.charAt(i);
        }

        int aschiiCode = alphabetToChar;

        System.out.println(aschiiCode);
    }
}