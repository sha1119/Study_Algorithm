package Step_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        double R = Double.parseDouble(bufferedReader.readLine());

        double euclidCircle = (R * R * Math.PI);
        double taxiCircle = (R * R * 2);

        stringBuilder.append(String.format("%.6f", euclidCircle)).append('\n').append(String.format("%.6f", taxiCircle));

        System.out.println(stringBuilder);
    }
}
