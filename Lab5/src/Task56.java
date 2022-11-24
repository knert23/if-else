import java.util.Scanner;

import static java.lang.System.out;

import static java.lang.Math.*;

public class Task56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите координату x точки");
        double x = scanner.nextDouble();
        out.println("Введите координату y точки");
        double y = scanner.nextDouble();
        int Count1 = 0;
        double Sqrt1 = sqrt(1 - pow((x - 2), 2));
        double Sqrt2 = sqrt(1 - pow((x + 2), 2));
        //Правая часть
        if ((x >= 0) & (x <= 6) & (y >= -3.0 / 2 * x + 4) & (y >= x / 3 + 1.0 / 3) & (y >= -2.0 / 7 * x + 10.0 / 7) &
                (y >= 0) & (y <= sqrt(36 - x * x)) & ((y >= Sqrt1 + 4) |
                (y <= -Sqrt1 + 4)))
            Count1++;
        //Левая часть
        if ((x >= -5) & (x <= 0) & (y <= 4) & (y <= 4.0 / 3 * x + 20.0 / 3) & (y>= 0) & (y >= x / 2 +1) &
                ((y >= Sqrt2 + 2) | (y <= -Sqrt2 + 2)))
            Count1++;
        if (Count1 > 0)
            out.println("Точка попала в область");
        else
            out.println("Точка не попала в область");
    }
}
