import java.util.Scanner;

import static java.lang.System.out;

public class Task58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите день недели:");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                out.println("Мама моет посуду");
                out.println("Папа поливает цветы");
                out.println("Дочка протирает подоконники");
                out.println("Сын подметает полы");
                break;
            case 2:
                out.println("Мама подметает полы");
                out.println("Папа протирает люстры");
                out.println("Дочка протирает цветы");
                out.println("Сын моет посуду");
                break;
            case 3:
                out.println("Мама протирает пыль");
                out.println("Папа моет посуду");
                out.println("Дочка выкидывает мусор");
                out.println("Сын протирает окна");
                break;
            case 4:
                out.println("Мама моет посуду");
                out.println("Папа протирает подоконники");
                out.println("Дочка подметает полы");
                out.println("Сын поливает цветы");
                break;
            case 5:
                out.println("Мама моет кухонные приборы");
                out.println("Папа подметает полы");
                out.println("Дочка вытирает пыль с мебели");
                out.println("Сын моет посуду");
                break;
            case 6:
                out.println("Мама меняет постельное белье");
                out.println("Папа стирает белье");
                out.println("Дочка моет посуду");
                out.println("Сын моет полы");
                break;
            case 7:
                out.println("Мама моет посуду");
                out.println("Папа выносит мусор");
                out.println("Дочка поливает цветы");
                out.println("Сын выхлопывает ковры");
        }
    }
}
