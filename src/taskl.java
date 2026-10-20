import java.util.Scanner;

public class taskl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int t = 0;

        if(c <= a){
            t = 2*b;
        }else{
            int ts = c*2;
            int but  =(ts- a-1)/a;
            t = but *b;
        }
        System.out.println(t);





    }
}