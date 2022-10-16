public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int saving = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total += total / 100;
            total = total + saving;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        // Задание 2
        System.out.println("Задание 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int number2 = 10; number2 >= 1; number2--) {
            System.out.print(number2 + " ");
        }
        System.out.println();
        // Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int balance = born - death;
        for(int year = 1; year <= 10; year++) {
            population += population * balance / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
}

