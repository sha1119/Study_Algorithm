package Practice01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class No_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        String[] mixer = new String[N];

        for (int i = 0; i < N; i++) {
            mixer[i] = bufferedReader.readLine();
        }

        Arrays.sort(mixer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mixer[0]).append('\n');

        for (int i = 1; i < N; i++) {
            if (!mixer[i].equals(mixer[i - 1])) {
                stringBuilder.append(mixer[i]).append('\n');
            }
        }

        System.out.println(stringBuilder);
    }
}