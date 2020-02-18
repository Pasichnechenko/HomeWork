package hm2;
import java.util.Scanner;

    public class HT2 {
    public static class task1 {
        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            System.out.println("Введите три целых числа: ");
            int number1 = a.nextInt();
            int number2 = a.nextInt();
            int number3 = a.nextInt();
            if (number2 < number1 && number1 > number3) {
                System.out.println("Максимальное число: " + number1);
            }
            if (number1 < number2 && number2 > number3) {
                System.out.println("Максимальное число: " + number2);
            }
            if (number2 < number3 && number3 > number1) {
                System.out.println("Максимальное число: " + number3);
            }
        }
    }

    public static class task2 {
        public static void main(String[] args) {
            int a = 100;
            int b = 200;
            int c;
            c = a;
            a = b;
            b = c;
            System.out.println(a);
            System.out.println(b);

        }
    }
     public static class task3 {
        public static void main(String[] args) {
            Scanner m = new Scanner(System.in);
            System.out.println("Введите два числа четное и нечетное");
            int w1 = m.nextInt();
            System.out.println("Введите еще одно число");
            int w2 = m.nextInt();
            if (w1 % 2 != 0) {
                System.out.print("Нечетное:" + w1);
            }
            if (w2 % 2 != 0) {
                System.out.print("Нечетное:" + w2);
            }


        }


        public static class task5 {
            public static void main(String[] args) {
                Scanner p = new Scanner(System.in);
                int q;
                System.out.print("Введите год:");
                q = p.nextInt();
                int b = q % 400;
                int c = q % 100;
                int d = q % 4;
                if (d < 1 && c >= 1) {
                    System.out.println("Вискосный год, 366 дней");
                } else if (b < 1) {
                    System.out.println("високосный год, 365 дней");
                } else {
                    System.out.println("Не високосный год, 365 дней");
                }
            }

        }
}
     public static class task6 {
        public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            System.out.println("Введите любое число:");
            int w1 = n.nextInt();
        }
    }
     public static class task7 {
        public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            System.out.println("Введите длину стороны треугольника а: ");
            int a = n.nextInt();
            System.out.println("Введите длину стороны треугольника b: ");
            int b = n.nextInt();
            System.out.println("Введите длину стороны треугольника c: ");
            int c = n.nextInt();
            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.println("Такой треугольник существует: ");
            } else System.out.println("Такой треугольник не существует: ");
        }
    }

    public static class task8 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите свой возраст ");
            int age = scan.nextInt();
            switch (age / 10) {
                case (0):
                    System.out.println("Вы молоденький");
                    break;
                case (1):
                    System.out.println("Вам пора уже начинать думать своей  головой");
                    break;
                case (2):
                    System.out.println("Все, пора идти бабки зарабатывать");
                    break;
                case (3):
                    System.out.println("Опа, пришла пора для деток");
                    break;
                case (4):
                    System.out.println("Опа-па-па, поздравляю Вас, вы задержались в поре для деток.");
                    break;
                case (5):
                    System.out.println("Пора заниматься спортов, а то старость близка");
                    break;
                case (6):
                    System.out.println("Ну и настало время для внуков, для того чтоб не сильно раслабиться");
                    break;
                case (7):
                    System.out.println("Вот тут чуть можно начинать раслабляться, но не сильно");
                    break;
                case (8):
                    System.out.println("Пора выдохнуть.....");
                    break;
                case (9):
                    System.out.println("оййййй даже не знаю как этот период назвать");
                    break;
                case (10):
                    System.out.println("Вы прожили шикарную жизнь(наверное)");
                    break;
            }
        }
    }

    public static class task9 {
        public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            System.out.println("Введите три целых числа: ");
            int number1 = a.nextInt();
            int number2 = a.nextInt();
            int number3 = a.nextInt();
            if (number2 > number1 && number1 < number3) {
                System.out.println("Минимальное число: " + number1);
            }
            if (number1 > number2 && number2 < number3) {
                System.out.println("Минимальное число: " + number2);
            }
            if (number2 > number3 && number3 < number1) {
                System.out.println("Минимальное число: " + number3);
            }
        }
    }
}

