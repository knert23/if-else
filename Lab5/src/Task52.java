import java.util.Scanner;

import static java.lang.System.out;

public class Task52 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        out.println("Введите первое число:");
        a = scanner.nextDouble();
        out.println("Введите второе число:");
        b = scanner.nextDouble();
        out.println("Введите третье число:");
        c = scanner.nextDouble();
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        if ((a > b) & (a > c)) {
            out.println("Наибольшее число:" + a);
        }
            else if ((b > a) & (b > c)) {
                out.println("Наибольшее число:" + b);
            }
                else if ((c > a) & (c > b)) {
                    out.println("Наибольшее число:" + c);
                 }
        if (( a < b) & (a < c)) {
            out.println("Наименьшее число:" + a);
        }
            else if ((b < a) & (b < c)){
                out.println("Наименьшее число:" + b);
            }
                    else if ((c < a) & (c < b)){
                    out.println("Наименьшее число:" + c);
                }
    }

}
