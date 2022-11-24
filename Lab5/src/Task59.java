import java.util.Scanner;

import static java.lang.System.out;

public class Task59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Для ответов на следующие вопросы вводите true, если ваш ответ - 'да', иначе вводите false");
        out.println("Есть ли у вас автомобиль?");
        boolean ans1 = scanner.nextBoolean();
        if (ans1) {
            out.println("Какая у вас марка автомобиля?");
            out.println("1 - Toyota");
            out.println("2 - Hyundai");
            out.println("3 - Lada");
            out.println("4 - Kia");
            out.println("5 - Nissan");
            out.println("6 - Марки моего автомобиля нет в списке");
            int mark = scanner.nextInt();
            switch (mark) {
                case 1:
                    out.println("Вы являетесь владельцем автомобиля марки Toyota");
                    break;
                case 2:
                    out.println("Вы являетесь владельцем автомобиля марки Hyundai");
                    break;
                case 3:
                    out.println("Вы являетесь владельцем автомобиля марки Lada");
                    break;
                case 4:
                    out.println("Вы являетесь владельцем автомобиля марки Kia");
                    break;
                case 5:
                    out.println("Вы являетесь владельцем автомобиля марки Nissan");
                    break;
                case 6:
                    out.println("Сожалеем, что марки вашей машины нет в списке, в будущем мы дополним его");
                    break;
                default:
                    out.println("Вы ввели номер, отсутствующий в списке");
                    break;
            }
        }
        else {
            out.println("Какую марку автомобиля вы хотите приобрести?");
            out.println("1 - Mercedes-Benz");
            out.println("2 - BMW");
            out.println("3 - Lada");
            out.println("4 - Toyota");
            out.println("5 - Volkswagen");
            out.println("6 - Марки автомобиля нет в списке");
            out.println("7 - Я не хочу приобретать автомобиль");
            int mark1 = scanner.nextInt();
            switch (mark1) {
                case 1:
                    out.println("Вы хотите приобрести автомобиль марки Mercedes-Benz");
                    break;
                case 2:
                    out.println("Вы хотите приобрести автомобиль марки BMW");
                    break;
                case 3:
                    out.println("Вы хотите приобрести автомобиль марки Lada");
                    break;
                case 4:
                    out.println("Вы хотите приобрести автомобиль марки Toyota");
                    break;
                case 5:
                    out.println("Сожалеем, что марки желанной машины нет в списке, в будущем мы дополним его");
                    break;
                case 6:
                    out.println("Вы не хотите приобретать машину");
                    break;
                default:
                    out.println("Вы ввели номер, отсутствующий в списке");
                    break;
            }
        }
        out.println("Вы бы хотели приобрести автомобиль отечественного автопрома - Lada?");
        boolean  ans2 = scanner.nextBoolean();
        if (ans2) {
            out.println("Какую бы модель вы приобрели?");
            out.println("1 - Niva");
            out.println("2 - Vesta");
            out.println("3 - Kalina");
            out.println("4 - Largus");
            out.println("5 - Granta");
            out.println("6 - Модели автомобиля нет в списке");
            int model = scanner.nextInt();
            switch (model) {
                case 1:
                    out.println("Вы бы приобрели автомобиль Lada модели Niva");
                    break;
                case 2:
                    out.println("Вы бы приобрели автомобиль Lada модели Vesta");
                    break;
                case 3:
                    out.println("Вы бы приобрели автомобиль Lada модели Kalina");
                    break;
                case 4:
                    out.println("Вы бы приобрели автомобиль Lada модели Largus");
                    break;
                case 5:
                    out.println("Вы бы приобрели автомобиль Lada модели Granta");
                    break;
                case 6:
                    out.println("Сожалеем, что модели автомобиля Lada, которую вы бы хотели приобрели нету в списке");
                    break;
                default:
                    out.println("Вы ввели номер, отсутствующий в списке");
                    break;
            }
        }
        else {
            out.println("Вы не хотели бы приобретать автомобиль отечественного автопрома");
            out.println("Понимаем вас");
        }
        out.println("Вы бы хотели что-то изменить в автомобилях Lada?");
        boolean ans3 = scanner.nextBoolean();
        if (ans3) {
            out.println("Чтобы вы изменили?");
            out.println("1 - Пора бы уже сделать рейстайлинг");
            out.println("2 - Долой руководство, на их места молодых специалистов");
            out.println("3 - Добавил бы пару-тройку новых моделей");
            out.println("4 - Сделал бы покупку автомобиля без дополнительных услуг");
            out.println("5 - Уменьшил стоимость автомобиля");
            out.println("6 - Моего варианта нет в списке");
            int change = scanner.nextInt();
            switch (change) {
                case 1:
                    out.println("Да, давно пора, уже как 30 лет пора");
                    break;
                case 2:
                    out.println("После этого наш автопром точно выйдет на новый уровень");
                    break;
                case 3:
                    out.println("Да, почему бы не добавить новые модели. Где разнообразие?");
                    break;
                case 4:
                    out.println("Согласны, сейчас без дополнительных услуг не найти автомобиль, " +
                            "а вмести с ними он стоит значительно дороже");
                    break;
                case 5:
                    out.println("Нам тоже кажется, что цена завышена, ведь ломаются слишком быстро");
                    break;
                case 6:
                    out.println("Учтём это, добавим больше в следующий раз");
                    break;
                default:
                    out.println("Вы ввели номер, отсутствующий в списке");
                    break;
            }
        }
        else {
            out.println("Согласны с вами, в них нечего менять");
            out.println("Они и так прекрасны");
        }
        out.println("Заменят ли электроавтомобили ДВС автомобили в скором времени (в течение 10-15 лет)?");
        boolean ans4 = scanner.nextBoolean();
        if (ans4) {
            out.println("Как вы считаете, почему так произойдет?");
            out.println("1 - Электроавтомобили намного экологичнее");
            out.println("2 - Они технологичнее");
            out.println("3 - Даже семейный электромобиль может быстро ехать");
            out.println("4 - Экосообщество надавит на автопроизводителей");
            out.println("5 - Произойдёт нехватка сырья, а именно нефти, для ДВС в скором времени");
            out.println("6 - Моего варинта нет в списке");
            int reasons1 = scanner.nextInt();
            switch (reasons1) {
                case 1:
                    out.println("Да, они не выбрасывают в атмосферу вредных соединений");
                    break;
                case 2:
                    out.println("Нельзя не согласиться! В них столько всего навороченного. Уже почти, как смартфон");
                    break;
                case 3:
                    out.println("С этим трудно поспорить, семейный электромобиль может разогнаться до 100 км/ч за 2с");
                    break;
                case 4:
                    out.println("Сейчас на всех производителей давит экоосообщество, некуда деться");
                    break;
                case 5:
                    out.println("Да, еще каких-то лет 25-30 с нынешней нормой добычи и нефть иссякнет");
                    break;
                case 6:
                    out.println("В следующий раз мы точно добавим ваш вариант!");
                    break;
                default:
                    out.println("Вы ввели номер, отсутствующий в списке");
                    break;
            }
        }
        else {
            out.println("Значит, вы полагаете, что этого не произойдёт. И почему же?");
            out.println("1 - Человечеству не хватит сырья");
            out.println("2 - Некоторые государтсва, чей экспорт завязан на нефти, будут сопротивляться");
            out.println("3 - Если все будут пользоваться электроавтомобилями, это спровоцирует нехватку электроэнергии");
            out.println("4 - Они не так экологичны, например они так же используют резину, как и ДВС автомобили");
            out.println("5 - Цена на электромобили взлетит до небес");
            out.println("6 - Моего варианта нет в списке");
            int reasons2 = scanner.nextInt();
            switch (reasons2) {
                case 1:
                    out.println("Действительно, многие места добычи сырья истощены");
                    break;
                case 2:
                    out.println("С этим трудно поспорить. Кто будет покупать, если никому не нужно? " +
                            "Произойдёт упадок экономики");
                    break;
                case 3:
                    out.println("Согласны. Сколько же электроэнергии потребуется для зарядки всех электромобилей?");
                    break;
                case 4:
                    out.println("Вдобавок еще и производство электроэнергии сильно загрязняет окружающую среду");
                    break;
                case 5:
                    out.println("Возможно, ведь их производство стоит дорого, а ДВС автомобили, наоборот, подешевеют");
                    break;
                case 6:
                    out.println("Извините, учтем это в следующий раз");
                    break;
                default:
                    out.println("Вы ввели номер, отсутствующий в списке");
                    break;
            }
        }
        out.println("Благодарим вас за прохождение опроса!");
    }
}