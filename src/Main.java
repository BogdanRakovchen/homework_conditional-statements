public class Main {
    public static void main(String[] args) {

        // exercise 1

        System.out.println("Задание №1");

        System.out.println("");

        int clientAndroid = 1;
        int clientIOS = 0;

        if (clientAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if(clientIOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // exercise 2

        System.out.println("Задание №2");

        System.out.println("");

        int clientDeviceYear = 2014;

        if (clientAndroid == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientIOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientAndroid == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientIOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // exercise 3

        System.out.println("Задание №3");

        System.out.println("");

        int year = 2021;

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        // exercise 4

        System.out.println("Задание №4");

        System.out.println("");

        int deliveryDistance = 20;
        int daysDelivery;

        if(deliveryDistance == 20) {
            daysDelivery = 1;
            System.out.println( "Потребуется дней: " + daysDelivery );
        } else if(deliveryDistance >= 20 && deliveryDistance <= 60) {
            daysDelivery = 2;
            System.out.println( "Потребуется дней: " + daysDelivery );
        } else if(deliveryDistance >= 60 && deliveryDistance <= 100) {
            daysDelivery = 3;
            System.out.println( "Потребуется дней: " + daysDelivery );
        }

        // exercise 5

        System.out.println("Задание №5");

        System.out.println("");

        int monthNumber = 7;


        switch(monthNumber) {

            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                break;
        }

    }

}



