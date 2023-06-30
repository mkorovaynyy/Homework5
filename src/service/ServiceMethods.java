package service;

public class ServiceMethods {
    public static void printDelivery(int distance) {
        if (distance < 20) {
            System.out.println("Потребуется дней на доставку: 1");
        } else if (distance < 60) {
            System.out.println("Потребуется дней на доставку: 2");
        } else if (distance < 100) {
            System.out.println("Потребуется дней на доставку: 3");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
    public static void printYear(int year) {
        if ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0) {
            System.out.println("год " + year + " является високосным");
        } else {
            System.out.println("год " + year + " не является високосным");
        }
    }
    public static void printLiteOs(int codeOs) {
        switch (codeOs) {
            case (0): {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                break;
            }
            case (1): {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                break;
            }
            default: {
                System.out.println("Введен не верный код ОС");
                break;
            }
        }
    }
    public static void printOS(int codeOs) {
        switch (codeOs) {
            case (0): {
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            }
            case (1): {
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            }
            default: {
                System.out.println("Введен не верный код ОС");
                break;
            }
        }
    }
    public static void printSeason(int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 12:
            case 2: {
                System.out.println("Зима");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("Весна");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("Лето");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Осень");
                break;
            }
            default: {
                System.out.println("Такого номера месяца не существует");
                break;
            }
        }
    }
}
