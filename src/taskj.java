import java.util.Scanner;

public class taskj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int s = (a*100+b);
        int r = (c*100+d);

        int cop = (r-s);

        int s1 = cop/100;
        int r1 = cop%100;

        System.out.println(s1+" "+ r1);



    }
}