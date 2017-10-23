package lab2;

import java.util.Scanner;

/**
 * Created by pro-1 on 19.09.2017.
 */
public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int edge;
        edge = s.nextInt();
        if (edge <= 0) {
            System.out.println("Значение edge должно быть положительно");
            return;
        }

        int area;
        area = 6 * (edge * edge);
        System.out.println(area);
    }
}
