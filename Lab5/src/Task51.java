import static java.lang.System.out;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task51 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, uABC;
        Scanner vision = new Scanner(System.in);
        out.println("Введите координату x точки A:");
        x1 = vision.nextDouble();
        out.println("Введите координату y точки A:");
        y1 = vision.nextDouble();
        out.println("Введите координату x точки B:");
        x2 = vision.nextDouble();
        out.println("Введите координату y точки B:");
        y2 = vision.nextDouble();
        out.println("Введите координату x точки C:");
        x3 = vision.nextDouble();
        out.println("Введите координату y точки C:");
        y3 = vision.nextDouble();
        if ((x2 - x1) / (x3 - x1) == (y2 - y1) / (y3 - y1)) {
            out.println("Точки расположены на одной прямой");
        }
            else {
                uABC = (acos(((x1 - x2) * (x3 - x2) + (y1 - y2) * (y3 - y2)) /
                        ((sqrt((pow((x1 - x2), 2) + (pow((y1 - y2), 2))))) *
                                (sqrt((pow((x3 - x2), 2) + (pow((y3 - y2), 2)))))))) * (180 / PI);
                out.printf("Точки не лежат на одной прямой, угол ABC равен: %.2f", uABC);
            }
    }
}
