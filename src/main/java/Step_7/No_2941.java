package Step_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String input = br.readLine();

        for (int i = 0; i < croatia.length; i++) {
            input = input.replace(croatia[i],"~");

        }
        System.out.println(input.length());

    }
}
