import java.util.Scanner;
public class hw_case {
    public static void main(String[] args){
        /*
--------Кучмель Павел-------------------------------------------------------------------------
--------По непонятным мне причинам некоторые знаки заменились знаком "?"------------------------
         */
        Scanner in=new Scanner(System.in);
        //Case1. Дано целое число в диапазоне 1–7. Вывести строку — название дня
        //недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).
        /*
        System.out.print("Введите номер дня недели: ");
        int day=in.nextInt();
        switch(day){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Нет такого дня недели");
                break;
         */
        /*
-----------------------------------------------------------------------------------------
         */
        //Case2. Дано целое число K.
        //Вывести строку-описание оценки, соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно»,
        //3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»). Если K не лежит в диапазоне 1–5,
        //то вывести строку «ошибка».
        /*
        System.out.print("Поставьте оценку от 1 до 5: ");
        int num=in.nextInt();
        switch (num){
            case 1:
                System.out.println("Плохо");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Ошибка");
        }
        */
        /*
-----------------------------------------------------------------------------------------------------
         */
        //Case3. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.).
        //Вывести название соответствующего времени года («зима»,
        //«весна», «лето», «осень»).
        /*
        System.out.println("Введите номер месяца: ");
        int month= in.nextInt();
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }
        */
        /*
-------------------------------------------------------------------------------------
         */
        //Case4. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —
        //февраль и т. д.). Определить количество дней в этом месяце для невисокосного года.
        /*
        System.out.println("Введите номер месяца: ");
        int month= in.nextInt();
        switch (month){
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 3:
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
        }
        */
        /*
--------------------------------------------------------------------------------------------
         */
        //Case5. Арифметические действия над числами пронумерованы следующим
        //образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление. Дан
        //номер действия N (целое число в диапазоне 1–4) и вещественные числа A
        //и B (В не равно 0). Выполнить над числами указанное действие и вывести
        //результат
        /*
        System.out.print("Enter number A: ");
        int a=in.nextInt();
        System.out.print("Enter number B: ");
        int b=in.nextInt();
        System.out.println("Enter action number(1-4): ");
        int n=in.nextInt();
        int res=0;
        switch (n){
            case 1:
                res=a+b;
                break;
            case 2:
                res=a-b;
                break;
            case 3:
                res=a*b;
                break;
            case 4:
                res=a/b;
                break;
        }
        System.out.println(res);
        */
        /*
--------------------------------------------------------------------------------------------
         */
        //Case6. Единицы длины пронумерованы следующим образом: 1 — дециметр,
        //2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр. Дан номер
        //единицы длины (целое число в диапазоне 1–5) и длина отрезка в этих
        //единицах (вещественное число). Найти длину отрезка в метрах.
        /*
        System.out.print("Enter unit number: ");
        int num= in.nextInt();
        System.out.print("Enter the number: ");
        int a=in.nextInt();
        switch (num){
            case 1:
                System.out.println(a+" decimeter = "+a*10+" meters");
                break;
            case 2:
                System.out.println(a+" kilometer = "+a*1000+" meters");
                break;
            case 3:
                System.out.println(a+" meters");
                break;
            case 4:
                System.out.println(a+" millimeter = "+a/(double)1000+" meters");
                break;
            case 5:
                System.out.println(a+" centimeter = "+a/(double)10+" meters");
                break;
        }
        */
        /*
---------------------------------------------------------------------------------------------------
         */
        //Case8. Даны два целых числа: D (день) и M (месяц),
        //определяющие правильную дату невисокосного года.
        //Вывести значения D и M для даты,
        //предшествующей указанной.
        /*
        System.out.println("Enter data (day and month)");
        System.out.print("Day: ");
        int day=in.nextInt();
        System.out.print("Month: ");
        int month=in.nextInt();
        day=day-1;
        if(day==0){
            month=month-1;
            if(month==0){
                month=12;
            }
            switch (month){
                case 1:
                    day=31;
                    break;
                case 2:
                    day=28;
                    break;
                case 3:
                    day=31;
                    break;
                case 4:
                    day=30;
                    break;
                case 5:
                    day=31;
                    break;
                case 6:
                    day=30;
                    break;
                case 7:
                    day=31;
                    break;
                case 8:
                    day=31;
                    break;
                case 9:
                    day=30;
                    break;
                case 10:
                    day=31;
                    break;
                case 11:
                    day=30;
                    break;
                case 12:
                    day=31;
                    break;
            }
        }
        System.out.println("Yesterday was "+day+" month "+month);
        */
        /*
--------------------------------------------------------------------------------------------------------
         */
        //Case9. Даны два целых числа: D (день) и M (месяц),
        //определяющие правильную дату невисокосного года.
        //Вывести значения D и M для даты, следующей за указанной.
        /*
        System.out.println("Enter data (day and month)");
        System.out.print("Day: ");
        int day=in.nextInt();
        System.out.print("Month: ");
        int month=in.nextInt();
        int dim=0;
        day=++day;
        switch (month){
            case 1:
                dim=31;
                break;
            case 2:
                dim=28;
                break;
            case 3:
                dim=31;
                break;
            case 4:
                dim=30;
                break;
            case 5:
                dim=31;
                break;
            case 6:
                dim=30;
                break;
            case 7:
                dim=31;
                break;
            case 8:
                dim=31;
                break;
            case 9:
                dim=30;
                break;
            case 10:
                dim=31;
                break;
            case 11:
                dim=30;
                break;
            case 12:
                dim=31;
                break;
        }
        if(day>dim){
            day=1;
            ++month;
        }
        System.out.println("Tomorrow will be "+day+" day "+month+" month");
        */
        /*
-------------------------------------------------------------------------------------------
         */
        //Case10. Робот может перемещаться в четырех направлениях («С» — север,
        //«З» — запад, «Ю» — юг, «В» — восток) и принимать три цифровые команды:
        //0 — продолжать движение, 1 — поворот налево, ?1 — поворот
        //направо. Дан символ C — исходное направление робота и целое число N — посланная ему команда.
        //Вывести направление робота после выполнения полученной команды
        /*
        System.out.print("Введите исходное направлeние: ");
        char napravlenie=in.next().charAt(0);
        System.out.print("Введите команду: ");
        int com = in.nextInt();
        switch (napravlenie){
            case 'ю':
                switch (com){
                    case 0:
                        System.out.println("Робот навравится на юг");
                        break;
                    case 1:
                        System.out.println("Робот направится на восток");
                        break;
                    case -1:
                        System.out.println("Робот направится на запад");
                        break;
                }
                break;
            case 'з':
                switch (com){
                    case 0:
                        System.out.println("Робот навравится на запад");
                        break;
                    case 1:
                        System.out.println("Робот направится на юг");
                        break;
                    case -1:
                        System.out.println("Робот направится на север");
                        break;
                }
                break;
            case 'с':
                switch (com){
                    case 0:
                        System.out.println("Робот навравится на север");
                        break;
                    case 1:
                        System.out.println("Робот направится на запад");
                        break;
                    case -1:
                        System.out.println("Робот направится на восток");
                        break;
                }
                break;
            case 'в':
                switch (com){
                    case 0:
                        System.out.println("Робот навравится на восток");
                        break;
                    case 1:
                        System.out.println("Робот направится на север");
                        break;
                    case -1:
                        System.out.println("Робот направится на юг");
                        break;
                }
                break;
        }
        */
        /*
-----------------------------------------------------------------------------------------------------
         */
        //Case11. Локатор ориентирован на одну из сторон света («С» — север, «З» —
        //запад, «Ю» — юг, «В» — восток) и может принимать три цифровые команды поворота:
        //1 — поворот налево, ?1 — поворот направо, 2 — поворот на 180?.
        //Дан символ C — исходная ориентация локатора и целые числа N1
        //и N2 — две посланные команды. Вывести ориентацию локатора после
        //выполнения этих команд.
        /*
        System.out.print("Введите исходное направление: ");
        char c=in.next().charAt(0);
        if (c=='ю'||c=='с'||c=='в'||c=='з') {
            System.out.print("Введите команду 1: ");
            int n1 = in.nextInt();
            if (n1 > 2 || n1 < -1 || n1 == 0) {
                System.out.println("Неверное зачение");
            } else {
                System.out.print("Введите команду 2: ");
                int n2 = in.nextInt();
                if (n2 > 2 || n2 < -1 || n2 == 0) {
                    System.out.println("Неверное зачение");
                } else {
                    int com = n1 + n2;
                    if (com == 4) {
                        com = 0;
                    }
                    switch (c) {
                        case 'ю':
                            switch (com) {
                                case 0:
                                    System.out.println("Юг");
                                    break;
                                case 1:
                                    System.out.println("Запад");
                                    break;
                                case 2:
                                    System.out.println("Север");
                                    break;
                                case 3:
                                    System.out.println("Восток");
                                    break;
                            }
                            break;
                        case 'з':
                            switch (com) {
                                case 0:
                                    System.out.println("Запад");
                                    break;
                                case 1:
                                    System.out.println("Север");
                                    break;
                                case 2:
                                    System.out.println("Восток");
                                    break;
                                case 3:
                                    System.out.println("Юг");
                                    break;
                            }
                            break;
                        case 'с':
                            switch (com) {
                                case 0:
                                    System.out.println("Север");
                                    break;
                                case 1:
                                    System.out.println("Восток");
                                    break;
                                case 2:
                                    System.out.println("Юг");
                                    break;
                                case 3:
                                    System.out.println("Запад");
                                    break;
                            }
                            break;
                        case 'в':
                            switch (com) {
                                case 0:
                                    System.out.println("Восток");
                                    break;
                                case 1:
                                    System.out.println("Юг");
                                    break;
                                case 2:
                                    System.out.println("Запад");
                                    break;
                                case 3:
                                    System.out.println("Север");
                                    break;
                            }
                            break;
                    }
                }
            }
        }
        else {
            System.out.println("Неверное значение");
        }
         */
        /*
--------------------------------------------------------------------------------------------------
         */
        //Case12. Элементы окружности пронумерованы следующим образом:
        //1 — радиус R, 2 — диаметр D = 2·R, 3 — длина L = 2·?·R, 4 — площадь круга S = ?·R^2.
        //Дан номер одного из этих элементов и его значение. Вывести
        //значения остальных элементов данной окружности (в том же порядке).
        //В качестве значения ? использовать 3.14.
        /*
        final double pi = 3.14;
        System.out.print("Введите номер 1-4: ");
        int num = in.nextInt();
        double r = 0;
        double d = 0;
        double l = 0;
        double s = 0;
        switch (num){
            case 1:
                System.out.print("Введите R: ");
                r = in.nextInt();
                d = 2*r;
                l = 2*pi*r;
                s = pi*(r*r);
                break;
            case 2:
                System.out.print("Введите D: ");
                d = in.nextInt();
                r = d/2;
                l = 2*pi*r;
                s = pi*(r*r);
                break;
            case 3:
                System.out.print("Введите L: ");
                l = in.nextInt();
                r = l/(2*pi);
                d = 2*r;
                s = pi*(r*r);
                break;
            case 4:
                System.out.print("Введите S: ");
                s = in.nextInt();
                r = s/pi;
                r = Math.sqrt(r);
                d = 2*r;
                l = 2*pi*r;
                break;
        }
        System.out.println("R="+r+"\nD="+d+"\nL="+l+"\nS="+s);
        */
        /*
---------------------------------------------------------------------------------------------
         */
        //Case13. Элементы равнобедренного прямоугольного треугольника пронумерованы следующим образом:
        //1 — катет a, 2 — гипотенуза c = a·?2, 3 — высота h, опущенная на гипотенузу (h = c/2), 4 — площадь S = c·h/2.
        //Дан номер одного из этих элементов и его значение. Вывести значения
        //остальных элементов данного треугольника (в том же порядке).
        /*
---------------------------------------------------------------------------------------------
         */
        //Case14. Элементы равностороннего треугольника пронумерованы следующим образом:
        //1 — сторона a, 2 — радиус R1 вписанной окружности(R1 = a·?3/6),
        //3 — радиус R2 описанной окружности (R2 = 2·R1), 4 — площадь S = a^2·?3/4.
        //Дан номер одного из этих элементов и его значение.
        //Вывести значения остальных элементов данного треугольника (в том же порядке).
        /*
---------------------------------------------------------------------------------------------
         */
        //Case15. Мастям игральных карт присвоены порядковые номера: 1 — пики,
        //2 — трефы, 3 — бубны, 4 — червы. Достоинству карт, старших десятки,
        //присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны
        //два целых числа: N — достоинство (6 ? N ? 14) и M — масть карты
        //(1 ? M ? 4). Вывести название соответствующей карты вида «шестерка
        //бубен», «дама червей», «туз треф» и т. п.
        /*
        System.out.print("Введите номер масти: ");
        int m = in.nextInt();
        System.out.println("Введите достоинство карты: ");
        int d = in.nextInt();
        String test = "0";
        switch (m){
            case 1:
                test = "Пик";
                break;
            case 2:
                test = "Треф";
                break;
            case 3:
                test = "Бубен";
                break;
            case 4:
                test = "Червей";
                break;
        }
        String test2 = "0";
        switch (d){
            case 6:
                test2 = "Шесть";
                break;
            case 7:
                test2 = "Семь";
                break;
            case 8:
                test2 = "Восемь";
                break;
            case 9:
                test2 = "Девять";
                break;
            case 10:
                test2 = "Десять";
                break;
            case 11:
                test2 = "Валет";
                break;
            case 12:
                test2 = "Дама";
                break;
            case 13:
                test2 = "Король";
                break;
            case 14:
                test2 = "Туз";
                break;
        }
        System.out.println(test2+" "+test);
         */
        /*
---------------------------------------------------------------------------------------------------------
         */
        //Case16. Дано целое число в диапазоне 20–69, определяющее возраст (в годах).
        //Вывести строку-описание указанного возраста, обеспечив правильное согласование числа со словом «год»,
        //например: 20 — «двадцать лет», 32 — «тридцать два года», 41 — «сорок один год».
        /*
        System.out.print("Введите число определяющее возраст (20-69): ");
        int year = in.nextInt();
        int des = year / 10;
        String des1 = " ";
        String ed1 = " ";
        String year1 = " ";
        int ed = year % 10;
        if (year < 20 || year > 69){
            System.out.println("Введен неверный возраст");
        }
        else {
            switch (des){
                case 2:
                    des1 = "Двадцать";
                    break;
                case 3:
                    des1 = "Тридцать";
                    break;
                case 4:
                    des1 = "Сорок";
                    break;
                case 5:
                    des1 = "Пятьдесят";
                    break;
                case 6:
                    des1 = "Шестьдесят";
                    break;
            }
            switch (ed){
                case 1:
                    ed1 = "один";
                    break;
                case 2:
                    ed1 = "два";
                    break;
                case 3:
                    ed1 = "три";
                    break;
                case 4:
                    ed1 = "четыре";
                    break;
                case 5:
                    ed1 = "пять";
                    break;
                case 6:
                    ed1 = "шесть";
                    break;
                case 7:
                    ed1 = "семь";
                    break;
                case 8:
                    ed1 = "восемь";
                    break;
                case 9:
                    ed1 = "девять";
                    break;
                default:
                    break;
            }
        }
        if (ed == 1){
            year1 = "год";
        }
        else {
            if (ed > 1 && ed < 5){
                year1 = "года";
            }
            else {
                if (ed > 4 && ed < 10 || ed == 0){
                    year1 = "лет";
                }
            }
        }
        if (year%10==0) {
            System.out.println(des1 + " " + year1);
        }
        else {
            System.out.println(des1 + " " + ed1 + " " + year1);
        }
        */
        /*
---------------------------------------------------------------------------------------------------
         */
        //Case17. Дано целое число в диапазоне 10–40, определяющее количество учебных заданий по некоторой теме.
        //Вывести строку-описание указанного количества заданий,
        //обеспечив правильное согласование числа со словами «учебное задание», например:
        //18 — «восемнадцать учебных заданий», 23 — «двадцать три учебных задания», 31 — «тридцать одно учебное задание».
        /*
---------------------------------------------------------------------------------------------------
         */
        //Case18. Дано целое число в диапазоне 100–999. Вывести строку-описание
        //данного числа, например: 256 — «двести пятьдесят шесть», 814 — «восемьсот четырнадцать».
        /*
        System.out.print("Введите число в диапазоне 100-999: ");
        int num = in.nextInt();
        int hundreds = num/100;
        int tens = num%100/10;
        int units = num%100%10;
        switch (hundreds){
            case 1:
                System.out.print("Сто ");
                break;
            case 2:
                System.out.print("Двести ");
                break;
            case 3:
                System.out.print("Триста ");
                break;
            case 4:
                System.out.print("Четыреста ");
                break;
            case 5:
                System.out.print("Пятьсот ");
                break;
            case 6:
                System.out.print("Шестьсот ");
                break;
            case 7:
                System.out.print("Семьсот ");
                break;
            case 8:
                System.out.print("Восемьсот ");
                break;
            case 9:
                System.out.print("Девятьсот ");
                break;
        }
        if (num%100>9&&num%100<20){
            switch (units){
                case 0:
                    System.out.println("десять");
                    break;
                case 1:
                    System.out.println("одинадцать");
                    break;
                case 2:
                    System.out.println("двенадцать");
                    break;
                case 3:
                    System.out.println("тринадцать");
                    break;
                case 4:
                    System.out.println("четырнадцать");
                    break;
                case 5:
                    System.out.println("пятнадцать");
                    break;
                case 6:
                    System.out.println("шестнадцать");
                    break;
                case 7:
                    System.out.println("семнадцать");
                    break;
                case 8:
                    System.out.println("восемнадцать");
                    break;
                case 9:
                    System.out.println("девятнадцать");
                    break;
            }
        }
        else {
            switch (tens) {
                case 2:
                    System.out.print("двадцать ");
                    break;
                case 3:
                    System.out.print("тридцать ");
                    break;
                case 4:
                    System.out.print("сорок ");
                    break;
                case 5:
                    System.out.print("пятьдесят ");
                    break;
                case 6:
                    System.out.print("шестьдесят ");
                    break;
                case 7:
                    System.out.print("семьдесят ");
                    break;
                case 8:
                    System.out.print("восемьдесят ");
                    break;
                case 9:
                    System.out.print("девяносто ");
                    break;
            }
            switch (units) {
                case 1:
                    System.out.print("один");
                    break;
                case 2:
                    System.out.print("два");
                    break;
                case 3:
                    System.out.print("три");
                    break;
                case 4:
                    System.out.print("четыре");
                    break;
                case 5:
                    System.out.print("пять");
                    break;
                case 6:
                    System.out.print("шесть");
                    break;
                case 7:
                    System.out.print("семь");
                    break;
                case 8:
                    System.out.print("восемь");
                    break;
                case 9:
                    System.out.print("девять");
                    break;
            }
        }
         */
        /*
------------------------------------------------------------------------------------------------------------
         */
        //Case19. В восточном календаре принят 60-летний цикл, состоящий из 12-
        //летних подциклов, обозначаемых названиями цвета: зеленый, красный,
        //желтый, белый и черный. В каждом подцикле годы носят названия животных:
        //крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны,
        //курицы, собаки и свиньи. По номеру года определить его название, если
        //1984 год — начало цикла: «год зеленой крысы».
        /*
        System.out.print("Калькулятор циклов восточного календаря. \nВведите год: ");
        int year = in.nextInt();
        if(year<-2697){
            System.out.println("Введенного года нет в восточном календаре.");
        }
        else {
            final int YEAR = 1984;                      //точка отсчета: первый год первого подцикла
            int god = Math.abs(year - YEAR);           //количество лет от/до точки отсчета
            int num = god % 60;                         //год в цикле. 0 - 60ый(последний) год цикла
            int color = num / 12;                      //номер цвета
            int animal = num % 12;                    //номер животного в подцикле
            if (year < YEAR && animal != 0) {
                animal = 12 - animal;                       //при значении года менее 1984
                if (color != 0) {
                    color = 4 - color;
                }
            }
            System.out.print("Год ");
            switch (color) {
                case 0:
                    if (animal > 1 && animal < 5) {
                        System.out.print("зеленого ");
                    } else {
                        System.out.print("зеленой ");
                    }
                    break;
                case 1:
                    if (animal > 1 && animal < 5) {
                        System.out.print("красного ");
                    } else {
                        System.out.print("красной ");
                    }
                    break;
                case 2:
                    if (animal > 1 && animal < 5) {
                        System.out.print("желтого ");
                    } else {
                        System.out.print("желтой ");
                    }
                    break;
                case 3:
                    if (animal > 1 && animal < 5) {
                        System.out.print("белого ");
                    } else {
                        System.out.print("белой ");
                    }
                    break;
                case 4:
                    if (animal > 1 && animal < 5) {
                        System.out.print("черного ");
                    } else {
                        System.out.print("черной ");
                    }
                    break;
            }
            switch (animal) {
                case 0:
                    System.out.println("крысы");
                    break;
                case 1:
                    System.out.println("коровы");
                    break;
                case 2:
                    System.out.print("тигра");
                    break;
                case 3:
                    System.out.print("заяца");
                    break;
                case 4:
                    System.out.print("дракона");
                    break;
                case 5:
                    System.out.print("змеи");
                    break;
                case 6:
                    System.out.print("лошади");
                    break;
                case 7:
                    System.out.print("овцы");
                    break;
                case 8:
                    System.out.print("обезьяны");
                    break;
                case 9:
                    System.out.print("курицы");
                    break;
                case 10:
                    System.out.print("собаки");
                    break;
                case 11:
                    System.out.print("свиньи");
                    break;
            }
        }
         */
        /*
-------------------------------------------------------------------------------------------------------
         */
        //Case20. Даны два целых числа: D (день) и M (месяц), определяющие правильную дату.
        //Вывести знак Зодиака, соответствующий этой дате: «Водолей» (20.1–18.2),
        //«Рыбы» (19.2–20.3), «Овен» (21.3–19.4), «Телец» (20.4–20.5), «Близнецы» (21.5–21.6),
        //«Рак» (22.6–22.7), «Лев» (23.7–22.8), «Дева» (23.8–22.9), «Весы» (23.9–22.10),
        //«Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).
        System.out.print("Калькулятор расчета знака Зодиак. \nВведите день: ");
        int day = in.nextInt();
        System.out.print("Введите месяц: ");
        int month = in.nextInt();
        switch (month){
            case 1:
                if(day<20) {
                    System.out.println("Козерог");
                }
                else {
                    System.out.println("Водолей");
                }
                break;
            case 2:
                if(day<19){
                    System.out.println("Водолей");
                }
                else {
                    System.out.println("Рыбы");
                }
                break;
            case 3:
                if(day<21){
                    System.out.println("Рыбы");
                }
                else {
                    System.out.println("Овен");
                }
                break;
            case 4:
                if(day<20){
                    System.out.println("Овен");
                }
                else {
                    System.out.println("Телец");
                }
                break;
            case 5:
                if(day<21){
                    System.out.println("Телец");
                }
                else {
                    System.out.println("Близнецы");
                }
                break;
            case 6:
                if(day<22){
                    System.out.println("Близнецы");
                }
                else {
                    System.out.println("Рак");
                }
                break;
            case 7:
                if(day<23) {
                    System.out.println("Рак");
                }
                else {
                    System.out.println("Лев");
                }
                break;
            case 8:
                if(day<23){
                    System.out.println("Лев");
                }
                else{
                    System.out.println("Дева");
                }
                break;
            case 9:
                if(day<23){
                    System.out.println("Дева");
                }
                else {
                    System.out.println("Весы");
                }
                break;
            case 10:
                if(day<23){
                    System.out.println("Весы");
                }
                else {
                    System.out.println("Скорпион");
                }
                break;
            case 11:
                if(day<23){
                    System.out.println("Скорпион");
                }
                else {
                    System.out.println("Стрелец");
                }
                break;
            case 12:
                if(day<22){
                    System.out.println("Стрелец");
                }
                else {
                    System.out.println("Козерог");
                }
                break;
        }
    }
}