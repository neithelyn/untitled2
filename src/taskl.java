import java.util.Scanner;

public class taskl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long m = sc.nextLong();
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(0);
        } else if (n <= k) {
            System.out.println(2 * m);
        } else {
            long rounds = (2 * n + k - 1) / k;
            System.out.println(rounds * m);
        }
    }
}