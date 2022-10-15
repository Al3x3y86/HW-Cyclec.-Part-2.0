public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int year = 1822;
        int futureYear = 2122;
        for (; year <= futureYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

        // Задание 2
        System.out.println("Задание 2");
        int number =2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}


