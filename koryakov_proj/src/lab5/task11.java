package lab5;

import java.util.Scanner;

/**
 * Created by pro-1 on 19.09.2017.
 */
public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if (a < b && b < c) {
            System.out.println("Выполняется");


        } else {
            System.out.println("Не выполняется");

        }
    }
}

