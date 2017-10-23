package lab7;

import java.util.Scanner;

/**
 * Created by pro-1 on 23.10.2017.
 */
public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        str = "abcdefwxyz";
        String part = s.next();
        int i = str.indexOf(part);

        if (i == -1) {
            System.out.println("Не содержится");
            return;
        }
        int result;
        result = str.length() - i - 1;
        System.out.println(result);
    }
}
