package lab6;

import java.util.Scanner;

/**
 * Created by pro-1 on 19.09.2017.
 */
public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        a = s.nextInt();
        b = s.nextInt();
//
//             System.out.println(a);
//             a = a+1;
//             System.out.println(a);
//             a=a+1;
//             System.out.println(a);
//             a = a+1;
//             System.out.println(a);
//             a=a+1;
//             System.out.println(a);
//
        if (a>b) {
            System.out.println("Значение A должно быть не больше значения B");
            return;
        }
        while (a<=b) {
            System.out.println(a);
            a = a + 1;
        }


    }
}
