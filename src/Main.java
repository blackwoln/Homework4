public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int iOs = 3;
        boolean clientOS = iOs == 0;
        if (clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
    }
}