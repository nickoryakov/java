package lab7;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by pro-1 on 23.10.2017.
 */
public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        str = "abcdefwxyz";
        String part = s.next();

        boolean f = str.contains(part);

        if (f) {
            System.out.println("Содержится");
        } else {
            System.out.println("Не содержится");
        }
    }
}

