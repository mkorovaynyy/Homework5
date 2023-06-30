import service.ServiceMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код операционной системы: 0 - iOS, 1 - Android");
        int clientOS = scanner.nextInt();
        ServiceMethods.printOS(clientOS);
    }
    public static void task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год выпуска");
        int year = scanner.nextInt();
        System.out.println("Введите код операционной системы: 0 - iOS, 1 - Android");
        int clientOS = scanner.nextInt();
        if (year > 2015) {
            ServiceMethods.printOS(clientOS);
        } else {
            ServiceMethods.printLiteOs(clientOS);
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        ServiceMethods.printYear(year);
    }
    public static void task4() {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние");
        int deliveryDistance = scanner.nextInt();
        ServiceMethods.printDelivery(deliveryDistance);
    }
    public static void task5() {
        System.out.println("Задача 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        ServiceMethods.printSeason(monthNumber);
    }
}