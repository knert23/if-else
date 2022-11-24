import java.util.Scanner;

import static java.lang.System.out;

import static java.lang.Math.*;

public class Task57 {
    public static void main(String[] args) {
        double g = 0, z = 0, x;
        Scanner scanner = new Scanner(System.in);
        out.println("Введите число в диапазоне [-4,4]:");
        x = scanner.nextDouble();
        if ((x >= -4) & (x <= 4)) {
            //первая функция g
            if ((3 * x + pow(sin(2 * x), 2 * E) / (10 + pow(tan(x), 3)) != 0) & (x <= 0)) {
                g = 2 * pow(x, 2) + ((3 * x + pow(sin(2 * x), 2 * E) / (10 + pow(tan(x), 3))));
                out.println("g1 = " + g);
            }
            if (((3 * x + pow(sin(2 * x), 2 * E) / (10 + pow(tan(x), 3)) == 0) & (x <= 0))) {
                out.println("Функция g1 не может быть определена, попробуйте ввести другое число");
            }
            //вторая функция g
            if (((1 + 2 * sin(x)) >= 0) & (x > 0)) {
                g = 2 * E + sqrt(1 + 2 * sin(x));
                out.println("g2 = " + g);
            }
            if ((1 + 2 * sin(x)) < 0 & (x > 0)) {
                out.println("Функция g2 не может быть определена, попробуйте ввести другое число");
            }
            //первая функция z
            if ((x < 0) & (cos(2 * x + 1) + (pow(E, pow(x, 2)) / E + pow(x, 2))) >= 0) {
                z = sqrt(cos(2 * x + 1) + (pow(E, pow(x, 2)) / E + pow(x, 2)));
                out.println("z1 = " + z);
            }
            if ((x < 0) & (cos(2 * x + 1) + (pow(E, pow(x, 2)) / E + pow(x, 2))) < 0) {
                out.println("Функция z1 не может быть определена, попробуйте ввести другое число");
            }
            //вторая функция z
            if ((x >= 0) & (x <= 1)) {
                z = 2 * pow(cos(pow(sin(x), 3)), 2);
                out.println("z2 = " + z);
                //else ((x >= 0) & (x <= 1) & ())
                //out.println("Функция z2 не может быть определена, попробуйте ввести другое число");
                //третья функция z
            }
            if ((x > 1) & (((1 / (x - 2)) + abs(2 * sin(pow(sqrt(3 * x), 1.0 / 3)))) >= 0) & ((1 / (x - 2)) != 0)) {
                z = sqrt((1 / (x - 2)) + abs(2 * sin(pow(sqrt(3 * x), 1.0 / 3))));
                out.println("z3 = " + z);
            }
            if ((x > 1) & ((1 / (x - 2)) + abs(2 * sin(pow(sqrt(3 * x), 1.0 / 3)))) < 0) {
                out.println("Функция z3 не может быть определена, попробуйте ввести другое число");
            }
        }
        else if ((x < -4) | (x > 4))
            out.println("Введите число в диапазоне [-4,4]");
    }
}
