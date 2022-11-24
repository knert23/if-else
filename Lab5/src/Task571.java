import java.util.Scanner;

import static java.lang.System.out;

import static java.lang.Math.*;

public class Task571 {
    public static void main(String[] args) {
        double g = 0, x;
        Scanner scanner = new Scanner(System.in);
        out.println("Введите число в диапазоне [-4,4]:");
        x = scanner.nextDouble();
        if ((x >= -4) & (x <= 4)) {
            //первая функция g
            if ((10+pow(tan(x),3)!=0) & (x <= 0) & ((pow(sin(2 * x), 2 * E)) >= (-1 * 10307)) &
                    ((pow(sin(2 * x), 2 * E)) <= 10307)) {
                g = 2 * pow(x, 2) + ((3 * x + pow(sin(2 * x), 2 * E)) / (10 + pow(tan(x), 3)));
                out.println("g = " + g);
                /*Ограниечение взято из Excel: "Чтобы исправить ошибку, измените формулу таким образом,
                чтобы результат ее вычисления находился в диапазоне от -1*10307 до 1*10307."*/
            }
            //вторая функция g
            else if (((1 + 2 * sin(x)) >= 0) & (x > 0) & (sin(x) >= (-1 * 10307)) & (sin(x) <= 10307)) {
                g = 2 * E + sqrt(1 + 2 * sin(x));
                out.println("g = " + g);
            }
            else {
                out.println("Функция g не может быть определена, попробуйте ввести другое число");
            }
        }
        else if ((x < -4) | (x > 4)) {
            out.println("Пожалуйста, введите число в диапазоне [-4,4]");
        }
    }
}