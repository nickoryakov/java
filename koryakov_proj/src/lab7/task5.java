package lab7;

import java.util.Scanner;

/**
 * Created by pro-1 on 23.10.2017.
 */
public class task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        str = "abcdefwxyz";
        int ca, cb;
        ca = s.nextInt();
        cb = s.nextInt();
        if (ca>cb) {
            System.out.println("Значение ca должно быть меньше cb");
            return;
        }
        if (ca<0 || ca>str.length()) {
            System.out.println("Значение ca должно быть в интервале [0;длинна строки)");
            return;
        }
        if (cb<0 || cb>str.length()) {
            System.out.println("Значение cb должно быть в интервале [0;длинна строки)");
            return;
        }
        String part;
        part = str.substring(ca, cb+1);
        System.out.println(part);
    }
}
