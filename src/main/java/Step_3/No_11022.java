package Step_3;

import java.util.Scanner;

public class No_11022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for (int t = 1; t <= i; t++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Case #" + t + ": " + a + " + " + b + " = " + (a + b) );
        }
    }
}
