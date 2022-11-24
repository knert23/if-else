import java.util.Scanner;

import static java.lang.System.out;

import static java.lang.Math.*;

public class Task53 {
    public static void main(String[] args) {
        double x, f;
        Scanner scanner = new Scanner(System.in);
        out.println("Введите перменную x принадлежащую диапазону [-3;3] с шагом 0,5:");
        x = scanner.nextDouble();
        if (x <= 3 & x >= -3) {
            if (x >= -1) {
                f = cos(x) + sin(x);
            }
            else {
                f = -(pow((x + 1), 2));
            }
            out.println("Функция f равна:" + f);
        }
        else {
            out.println("Вы ввели значения не из диапазона [-3;3]");
        }
    }
}
