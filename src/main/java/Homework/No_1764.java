package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = bufferedReader.readLine();
            hashMap.put(name, 1);
        }

        List<String> notHeardSeen = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String name = bufferedReader.readLine();

            if (hashMap.get(name) != null) {
                notHeardSeen.add(name);
            }
        }
        System.out.println(notHeardSeen.size());

        Collections.sort(notHeardSeen);
        for (int i = 0; i < notHeardSeen.size(); i ++) {
            System.out.println(notHeardSeen.get(i));
        }

    }
}
