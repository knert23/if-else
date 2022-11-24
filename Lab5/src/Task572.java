import java.util.Scanner;

import static java.lang.System.out;

import static java.lang.Math.*;

public class Task572 {
    public static void main(String[] args) {
        double z = 0, x;
        Scanner scanner = new Scanner(System.in);
        out.println("Введите число в диапазоне [-4,4]:");
        x = scanner.nextDouble();
        if ((x >= -4) & (x <= 4)) {
            //первая функция z
            if ((x < 0) & (E + (pow(x, 2)) != 0) & (cos(2 * x + 1) + (pow(E, pow(x, 2)) / E + pow(x, 2)) >= 0) &
                    ((cos(2 * x + 1)) >= (-1 * 10307)) & ((cos(2 * x + 1)) <= 10307)) {
                z = sqrt((cos(2 * x +1)) + ((pow(E,(x * x))) / (E + x * x)));
                out.println("z = " + z);
                /*"Ограниечение взято из Excel: Чтобы исправить ошибку, измените формулу таким образом,
                чтобы результат ее вычисления находился в диапазоне от -1*10307 до 1*10307."*/
            }
            //вторая функция z
            else if ((x >= 0) & (x <= 1) & ((pow(sin(x), 3)) >= (-1 * 10307)) &
                    ((pow(sin(x), 3)) <= 10307) & ((pow(cos(pow(sin(x), 3)), 2)) >= (-1 * 10307)) &
                    (pow(cos(pow(sin(x), 3)), 2)) <= 10307) {
                z = 2 * pow(cos(pow(sin(x), 3)), 2);
                out.println("z = " + z);
            }
            else if ((x > 1) & (((1 / (x - 2)) + abs(2 * sin(pow(sqrt(3 * x), 1.0 / 4)))) >= 0) & ((x - 2) != 0) &
                    ((sin(pow(sqrt(3 * x), 1.0 / 4))) >= (-1 * 10307)) & ((sin(pow(sqrt(3 * x), 1.0 / 4))) <= 10307)) {
                z = sqrt((1 / (x - 2)) + abs(2 * sin(pow(sqrt(3 * x), 1.0 / 3))));
                out.println("z = " + z);
            }
            else {
                out.println("Функция z не может быть определена, попробуйте ввести другое число");
            }
        }
        else if ((x < -4) | (x > 4))
            out.println("Введите число в диапазоне [-4,4]");

    }
}