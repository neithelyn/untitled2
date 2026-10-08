import java.util.Scanner;

public class taskM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();

        if ((a1 > 0)== (a2 > 0) &&(b1 >0) == (b2 > 0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}