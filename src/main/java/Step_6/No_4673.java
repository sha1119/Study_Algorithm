package Step_6;

public class No_4673 {
    public static void main(String[] args) {
        String A = getSelfNumber();

        System.out.println(A);
    }

    public static String getSelfNumber() {
        StringBuilder sb = new StringBuilder();
        int n = 1;
        int number = 1;
        int idx = 10001;
        int[] noSelfNumber = new int[idx]; // selfNumber[1] , [2] .... [10000]

        while (n < 10000) {
            number = d(n);
            n++;

            if (number <= 10000) {
                noSelfNumber[number] = 1;
            }
        }
        for (int i = 1 ; i < 10001; i++) {
            if (noSelfNumber[i] != 1) {
                sb.append(i).append("\n");
            }
        }

        return sb.toString();
    }

    public static int d(int n) {
        return n + sumOfDigits(n);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        for (int i = 0; i < 5; i ++) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
