package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Задание 1
        System.out.println("Введите год");

        Scanner time = new Scanner(System.in);
        int thisYear = time.nextInt();
        leapYear(thisYear);

        // Задание 2
        System.out.println("Напишите какую ОС вы используете: 0 - IOS, 1 - Android");
        Scanner Os = new Scanner(System.in);
        int clientOS = Os.nextInt();
        System.out.println("Какого года производства ваш телефон?");
        Scanner year = new Scanner(System.in);
        int phoneYear = year.nextInt();
        clientOs(clientOS, phoneYear);

        // Задание 3
        System.out.println("В скольких киллометрах доставка?");
        Scanner delivery = new Scanner(System.in);
        int deliveryDistance = delivery.nextInt();
        deliveryDistance(deliveryDistance);

        // Задание 4
        System.out.println("потыкайте на клавиатуре");
        Scanner wordScanner = new Scanner(System.in);
        String letters = wordScanner.nextLine();
        repetitiveLetters(letters);

        // Задание 5
        Scanner input = new Scanner(System.in);
        int[] newArray = new int[5];
        for (int i = 0; i < newArray.length; i++){
            System.out.println("Please enter number");
            newArray[i] = input.nextInt();
        }
        reverseArray(newArray);

    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Этот год не високосный");
        }
    }

    public static void clientOs(int clientOS, int phoneYear) {
        if (clientOS == 0) {
            if (phoneYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            if (phoneYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else
                System.out.println("Установите версию приложения для Android по ссылке");
        } else
            throw new RuntimeException("Что-то не так");
    }

    public static void deliveryDistance(int distance) {
        int days = 0;
        if (distance <= 20) {
            days++;
            System.out.println("Потребуется дней: " + days);
        } else if (distance <= 60) {
            days = days + 2;
            System.out.println("Потребуется дней: " + days);
        } else if (distance <= 100) {
            days = days + 3;
            System.out.println("Потребуется дней: " + days);
        } else {
            throw new RuntimeException("Вы слишком далеко");
        }
        System.out.println();
    }

    public static void repetitiveLetters(String letters) {
        char[] lettersToMassive = letters.toCharArray();
        Arrays.sort(lettersToMassive);
        for (int i = 0; i < lettersToMassive.length - 1; i++) {
            if (lettersToMassive[i] == lettersToMassive[i + 1]) {
                System.out.println("Символ \"" + lettersToMassive[i] + "\" задублирован");
                break;
            }
        }
    }

    public static void reverseArray (int[] reverse){
        for (int i = reverse.length - 1; i >= 0 ; i--) {
            System.out.print(reverse[i] + " ");
        }
    }
}


