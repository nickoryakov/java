package lab2;

import java.util.Scanner;

/**
 * Created by pro-1 on 19.09.2017.
 */
public class task20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mass, velocity, height;
        mass = s.nextDouble();
        velocity = s.nextDouble();
        height = s.nextDouble();
        if (mass <= 0) {
            System.out.println("Значение mass должно быть положительным");
            return;
        }
        if (velocity <= 0) {
            System.out.println("Значение velocity должно быть положительным");
            return;
        }
        if (height <= 0) {
            System.out.println("Значение height должно быть положитльным");
            return;
        }
        double kenergy, penergy;
        kenergy = (mass * (velocity * velocity)) / 2;
        penergy = mass * 9.8067 * height;
        System.out.printf("Кинетическая энергия составляет: %.4f  \n" +
                "Потенциальная энергия составляет: %.4f", kenergy, penergy);
    }
}
