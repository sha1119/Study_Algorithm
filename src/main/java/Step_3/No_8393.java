package Step_3;

import java.util.Scanner;

public class No_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
