public class Main {
    public static void main(String[] args) {
        {
        // Задача № 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            }
        }
        System.out.println();
        {
        // Задача № 2
            for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            }
        }
        System.out.println();
        {
        // Задача № 3
            for (int i = 0; i < 17; i=i+2) {
                System.out.println(i);
            }
        }
        System.out.println();
        {
        // Задача № 4
            for (int i = 10; i >= -10; i--) {
                System.out.println(i);
            }
        }
        System.out.println();
        {
            // Задача № 5
            for (int i = 1904; i <= 2096; i = i + 4) {
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println();
        {
            // Задача № 6
            for (int i = 7; i <= 98; i = i + 7) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        {
            // Задача № 7
            for (int i = 1; i <= 512; i = i * 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        {
            // Задача № 8
            for (int deposit = 100000, depositTotal = deposit,  month = 0; month <= 12; depositTotal = depositTotal + 29000, month = month + 1) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + depositTotal + " рублей");
            }
        }
        System.out.println();
        {
            // Задача № 9
            for (int deposit = 100000, depositTotal = deposit, month = 0; month <= 12; depositTotal = depositTotal + 29000 + depositTotal / 100, month = month + 1) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + depositTotal + " рублей");
            }
        }
        System.out.println();
        {
            // Задача № 10
            for (int i = 1, n = 1; i <= 20; n = n + 1, i = n * 2) {
                System.out.println("2*" + n + "=" + i );
            }
        }
    }
}