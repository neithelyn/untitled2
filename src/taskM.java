import java.util.Scanner;

public class taskM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Точки в одной четверти, если x1 и x2 одного знака И y1 и y2 одного знака
        if ((x1 * x2 > 0) && (y1 * y2 > 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}