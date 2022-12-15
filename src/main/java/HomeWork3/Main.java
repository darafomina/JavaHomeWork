package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ex1();
        /*ex2();*/

    }
        private static void ex1() {
/*        1. Пусть дан произвольный список целых чисел, удалить из него четные
    числа (в языке уже есть что-то готовое для этого).*/
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.print("Задание 1. Введите длинну списка: ");
            int len = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                list.add(random.nextInt(100));
            }
            System.out.println("Исходный список: " + list);

            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < list.size(); i++) {
                int x = list.get(i);
                if (x % 2 != 0)
                    arr.add(x);
        }
        System.out.println("Полученный список: "+ arr);
        }

    private static void ex2() {
/*        2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
        и среднее арифметическое из этого списка.*/
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("\nЗадание 2. Введите длинну списка: ");
        int len = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Исходный список: " + list);

        System.out.println("Минимальное число: " + Collections.min(list));
        System.out.println("Максимальное число: " + Collections.max(list));

        double sum = list.stream().mapToInt(Integer::intValue).sum();
        double result = (Math.abs(sum))/len;
        System.out.println("Среднее арифметическое: " + (result));
    }
}

