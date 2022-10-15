public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int saving = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total * 7 / 100;
            total = total + saving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        // Задание 2
        System.out.println("Задание 2");
        int saving2 = 15000;
        int total2 = 0;
        int i2 = 0;
        for (; total2 <= 12_000_000; i2++) {
            total2 = total2 + total2 * 7 / 100;
            total2 = total2 + saving2;
            if (i2 % 6 == 0) {
                System.out.println("Месяц " + i2 + ", сумма накоплений равна " + total2 + " рублей.");
            }
        }

        // Задание 3
        System.out.println("Задание 3");
        int saving3 = 15000;
        int total3 = 0;
        for (int i3 = 1; i3 <= 108; i3++) {
            total3 = total3 + total3 * 7 / 100;
            total3 = total3 + saving3;
            if (i3 % 6 == 0) {
                System.out.println("Месяц " + i3 + ", сумма накоплений равна " + total3 + " рублей.");
            }
        }
        // Задание 4
        System.out.println("Задание 4");
        int friday = 7;
        for ( friday =1; friday <=31; friday ++){
            if (friday % 7 ==0) {
                System.out.println("Сегодня пятница,"+ friday + "-е число. Необходимо подготовить отчет.");
            }
        }
    }
}



