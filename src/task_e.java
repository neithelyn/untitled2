import java.util.Scanner;

public class task_e {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int a1 = in.nextInt();
        int b1 = in.nextInt();

        int da = Math.abs(a - a1);
        int db = Math.abs(b - b1);


        if ((da == 1 && db == 2) || (da == 2 && db == 1)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}

