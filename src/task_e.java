import java.util.Scanner;

public class task_e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int a1 = in.nextInt();
        int b1 = in.nextInt();


        if ((a1-a == 2 && b1-b == 1) ||(a1-a == 1 || b1-b == 2)){
            System.out.println("YES");
        }  else
            System.out.println("NO");
        }
    }

