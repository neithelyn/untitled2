
import java.util.Scanner;

public class task_d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int a1 = in.nextInt();
        int b1 = in.nextInt();

        boolean d = Math.abs(a-a1) == Math.abs(b-b1);
        boolean h = (a==a1)|| (b == b1);
        boolean ise = (a != a1) || (b != b1);


        if ((d || h) && ise){
            System.out.println("YES");
        }  else {
            System.out.println("NO");
        }
    }
}
