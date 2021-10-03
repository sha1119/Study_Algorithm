package Step_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final ArrayList<Integer> X = new ArrayList<>();
        final ArrayList<Integer> Y = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            X.add(Integer.parseInt(stringTokenizer.nextToken()));
            Y.add(Integer.parseInt(stringTokenizer.nextToken()));
        }

        Integer x;
        Integer y;

        if (X.get(0).equals(X.get(1))) {
            x = X.get(2);
        } else if (X.get(0).equals(X.get(2))) {
            x = X.get(1);
        } else {
            x = X.get(0);
        }

        if (Y.get(0).equals(Y.get(1))) {
            y = Y.get(2);
        } else if (Y.get(0).equals(Y.get(2))) {
            y = Y.get(1);
        } else {
            y = Y.get(0);
        }

        System.out.println(x + " " + y);
    }
}
