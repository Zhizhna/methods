import java.time.LocalDate;

public class Main {
    public static void osManager(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (year >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (year >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void printNegResult(){
        System.out.println("не является високосным");
    }
    public static void printPosResult(){
        System.out.println("является високосны");
    }
    public static void leapYear(int number) {
        if (number >= 1584) {
            if (number % 4 == 0) {
                printPosResult();
            } else if (number % 400 == 0 && number % 100 != 0) {
                printPosResult();
            } else {
                printNegResult();
            }
        } else {
            printNegResult();
        }
    }
    public static void bankCardDelivery(int distance) {
        if (distance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        leapYear(year);
        byte clientOS = 0;
        int clientYear = 2020;
        osManager(clientOS, clientYear);
        int deliveryDistance = 95;
        bankCardDelivery(deliveryDistance);
    }
}