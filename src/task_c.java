
import java.util.Scanner;

public class task_c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int a1 = in.nextInt();
        int b1 = in.nextInt();


        if (Math.abs(a - a1) == Math.abs(b-b1) && (a !=a1 &&b !=b1)){
            System.out.println("YES");
        }  else {
            System.out.println("NO");
        }
    }
}
