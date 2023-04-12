public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1 () {
        System.out.println("Задача 1");

        int iOs = 3;
        int Android = 1;
        if (iOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } if (Android == 1) {
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
}