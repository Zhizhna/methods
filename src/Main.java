public class Main {
    public static void task2() {
        System.out.println("Task 2");
        byte clientOS2 = 0;
        short clientDeviceYear = 2015;
        if (clientOS2 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear >= 2015) {
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
    public static void task1(int number) {
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
    public static void task4() {
        System.out.println("Task 4");
        int deliveryDistance = 95;
        byte timeForDelivery = 0;
        if (deliveryDistance < 20) {
            //System.out.println("Доставка займет 1 день");
            //можно сделать два исколючения, чтобы было грамматно с точки зрения языка
            timeForDelivery = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            timeForDelivery = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            timeForDelivery = 3;
        } else if (deliveryDistance >= 100) {
            //System.out.println("доставки нет");
            timeForDelivery = 0;
        }
        if (timeForDelivery > 0) {
            System.out.println("Потребуется дней: " + timeForDelivery);
        } else {
            System.out.println("доставки нет");
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        task1(year);

    }
}