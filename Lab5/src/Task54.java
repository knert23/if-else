import java.util.Scanner;

import  static java.lang.System.out;

import static java.lang.Math.*;

public class Task54 {
    public static void main(String[] args){
        double x, y;
        Scanner a = new Scanner(System.in);
        out.println("Введите число x:");
        x = a.nextDouble();
        if (x < -2) {
            y = E + PI * x;
        }
        else if ((x < 2) & (x > -2)) {
            y = cos(sin(x));
        }
        else if (x > 2) {
            y = pow(E, cos(sin(cos(x))));
        }
        else {
            y = E;
        }
        out.println("Значение функции y:" + y);
    }
}
