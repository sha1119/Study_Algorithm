package Step_3;

import java.util.Scanner;

public class No_2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i;
        for (i = 1; i <= 9; i++)
        System.out.println(a + " * " + i + " = " + (a * i));
    }
}
