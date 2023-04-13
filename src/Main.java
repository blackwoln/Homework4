public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int iOs = 1;
        int Android = 1;
        int date = 2015;
        int dateTelephone = 2013;
        boolean dateIOsTelephoneNew = iOs == 0 && dateTelephone >= date;
        boolean dateIOsTelephoneStar = iOs == 0 && dateTelephone < date;
        boolean dateAndroidTelephoneNew = Android == 1 && dateTelephone >= date;
        boolean dateAndroidTelephoneStar = Android == 1 && dateTelephone < date;
        if (dateIOsTelephoneNew) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (dateAndroidTelephoneNew) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else  if (dateIOsTelephoneStar) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (dateAndroidTelephoneStar) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


    }

    public static void task3 () {
        System.out.println("Задача 3");

        int year = 2003;
        if ( year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ) {
            System.out.println( + year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0 ) {
            System.out.println(+ year + " год является високосным");
        } else
        {
            System.out.println(+ year + " год не является високосным");
        }
        
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int deliveryDistance = 77;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней 3");
        } else {
            System.out.println(" Доставки нет");
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");

        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимнее время года");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весеннее время года");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летнее время года");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осеннее время года");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }
}