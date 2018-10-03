package sigma.se;

import java.util.Scanner;
import static java.lang.Math.abs;


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int abs = abs(n2 - n1);
        if (abs < 180)
            System.out.println(n2 - n1);
        else if (abs == 180)
            System.out.println(180);
        else if (n2 - n1 > 0)
            System.out.println(-(360 - abs));
        else
            System.out.println(360 - abs);
    }
}
