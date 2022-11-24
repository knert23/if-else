import java.util.Scanner;

import static java.lang.System.out;

public class Task55Edit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите координату x точки");
        double x = scanner.nextDouble();
        out.println("Введите координату y точки");
        double y = scanner.nextDouble();
        //попадание в область первой фигурыы
        if (y >= x - 2) {
            int Count1 = 0;
            //1 область
            if ((x >= -5) & (x <= -3) & (y <= x + 4) & (y >= -x - 6) & (y >= 2 * x + 6)) {
                Count1++;
            }
            //2 область
            if ((x >= -3) & (x <= -1) & (y <= Math.sqrt(4 - Math.pow((x + 1), 2)) + 1) & (y >= x + 4)) {
                Count1++;
            }
            //3 область
            if ((x >= -1) & (x <= 2) & (y <= 2.0 / 3 * x + 11.0 / 3) & (y >= 5.0 / 3 * x + 5.0 / 3)) {
                Count1++;
            }
            //4 область
            if ((x >= -3) & (x <= -1) & (y <= x + 4) & (y >= -2 * x - 6) & (y >= x)) {
                Count1++;
            }
            //5 область
            if ((x >= 1) & (x <= 6) & (y <= x + 1) & (y <= -x / 2 + 7) & (y >= x - 2) & (y >= x / 3 + 2.0 / 3)) {
                Count1++;
            }
            //6 область
            if ((x >= -2) & (x <= 1) & (y <= 5 * x / 3 + 5.0 / 3) & (y >= x) & (y >= x + 1)) {
                Count1++;
            }
            //7 область
            if ((x >= -1) & (x <= 1) & (y <= x) & (y >= -Math.sqrt(4 - Math.pow((x + 1), 2)) + 1)) {
                Count1++;
            }
            if (Count1 > 0) {
                out.println("Точка попала в область первой фигуры");
            }
            if (Count1 == 0) {
                out.println("Точка не попала в область");
            }
        }
        //попадание в область второй фигуры
        else if (y < x - 2) {
            int Count2 = 0;
            //1 область
            if ((x >= 0) & (x <= 4) & (y <= x / 2 - 5) & (y >= x / 4 - 5)) {
                Count2++;
            }
            //2 область
            if ((x >= 2) & (x <= 4) & (y >= -Math.sqrt(4 - Math.pow((x - 4), 2)) - 1) & (y <= 1 - x)) {
                Count2++;
            }
            //3 область
            if ((x >= 3) & (x <= 4) & (y >= 1 - x) & (y <= x - 5) & (y >= 1 - x)) {
                Count2++;
            }
            //4 область
            if ((x >= 4) & (x <= 6) & (y <= Math.sqrt(4 - Math.pow((x - 4), 2)) - 1) & (y >= 5 - x)) {
                Count2++;
            }
            //5 область
            if ((x >= 4) & (x <= 7) & (y <= 0) & (y <= -x + 5) & (y >= -2)) {
                Count2++;
            }
            //6 область
            if ((x >= 4) & (x >= 5) & (y <= -3 * x + 10) & (y >= -x)) {
                Count2++;
            }
            if (Count2 > 0) {
                out.println("Точка попала в область второй фигуры");
            }
            if (Count2 == 0) {
                out.println("Точка не попала в область");
            }
        }
    }
}
