package lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by pro-1 on 30.10.2017.
 */
public class task1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        File f = new File("res\\task6175\\test" + n + ".txt");
        if (!f.exists()) {
            String fn;
            fn = f.getAbsolutePath();
            System.out.println("Файл" + fn + "не существует");
            return;
        }
        Scanner fs = new Scanner(f, "utf-8");
        String s;

//        s=fs.nextLine();
//        System.out.println(s);
//        s=fs.nextLine();
//        System.out.println(s);
//        s=fs.nextLine();
//        System.out.println(s);
//        s=fs.nextLine();
//        System.out.println(s);
//        s=fs.nextLine();
//        System.out.println(s);

        while (fs.hasNext()) {
              s=fs.nextLine();
            System.out.println(s);

        }


    }
}
