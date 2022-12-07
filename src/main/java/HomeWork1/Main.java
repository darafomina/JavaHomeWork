package HomeWork1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
    }

    private static boolean ex1() {
/*        1.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
        лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int sum = a+b;

        if (sum >= 10 && sum <= 20) {
            System.out.printf("Cумма лежит в пределах от 10 до 20.");
            return true;
        }
        else {
            System.out.print("Cумма НЕ лежит в пределах от 10 до 20.");
            return false;
        }
    }

    private static void ex2() {
    /*2.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.print("Число положительное.");
        } else {
            System.out.print("Число отрицательное.");
        }
    }

    private static boolean ex3() {
/*       3. Написать метод, которому в качестве параметра передается целое число. Метод должен
        вернуть true, если число отрицательное, и вернуть false если положительное.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.print("Число положительное.");
            return true;
        } else {
            System.out.print("Число отрицательное.");
            return false;
        }
    }

    private static void ex4() {
    /* 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
        отпечатать в консоль указанную строку, указанное количество раз;*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.next();

        System.out.print("Введите число строк: ");
        int count = scanner.nextInt();

        while (count != 0) {
            System.out.printf(string + "\n");
            count--;
        }
    }
    private static boolean ex5() {
        /*5.Написать метод, который определяет, является ли год високосным, и возвращает boolean
        (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого
        100-го, при этом каждый 400-й – високосный.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + "г. не високосный");
            return false;
        }
        else {
            System.out.println(year + "г. високосный");
            return true;
        }
    }

    private static void ex6() {
/*   6.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex7() {
/* 7.Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями
        1 2 3 4 5 6 7 8 … 100;*/
        int [] arr = new int[100];
        for (int i=0; i< arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex8() {
/*  8.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2;*/
        int[] arr = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void ex9() {
/* 9.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
     диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
     индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
        Random random = new Random();
        System.out.print("Введите одно число. Это будет размер квадратного массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];


        System.out.print("Массив c рандомными числами от 20 до 30:\n ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(20, 30);
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        System.out.print("Массив с 1 по диагоналям:\n ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static void ex10() {
/* 10.Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        System.out.print("Введите одно значение для всех ячеек массива: ");
        int initialValue = scanner.nextInt();

        int [] arr = new int[len];
        for (int i=0; i< arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println("Получившийся массив: " + Arrays.toString(arr));
    }

    private static void ex11() {
/* 11.Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Рандомный массив : " + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int i =1; i< arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Максимальное : " + max + ". Минимальное : " + min);
    }
}