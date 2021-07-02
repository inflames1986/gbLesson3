package ru.geekbrains.gbLesson;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        gameLesson3();

    }

    public static void gameLesson3() {

        int rep; // переменная для повтора игры

        do {
            int rNumber = random.nextInt(9);// генерируем случайное число
            boolean metka = false;

            for (int i = 0; i < 3; i++) {

                System.out.println("Введите число от 0 до 9");
                int uNumber = sc.nextInt(); // введенное число пользователя

                if (rNumber > uNumber) {
                    System.out.println("Загаданное число больше " + uNumber);
                }
                if (rNumber < uNumber) {
                    System.out.println("Загаданное число меньше " + uNumber);
                }
                if (rNumber == uNumber) {

                    metka = true;
                    break;
                }
            }

            if (metka) {
                System.out.println("Загаданное число = " + rNumber + " Вы угадали!");
            } else {
                System.out.println("Вы не угадали, загаданное число = " + rNumber + "!");

            }
            System.out.println("Хотите начать заново? Да - нажмите 1");
            rep = sc.nextInt();
        }
        while (rep == 1);
        System.out.println("ББ!");
    }
}
