package Lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    private static void ex1() {
        System.out.print("Введите Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
//        System.out.println("Привет, " + name);
        System.out.printf("Привет, %s%n", name);
    }

    static void ex2() {
        int counter = 0;
        int result = 0;
        Random random = new Random();


//        int[] binaryArray = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1};
        int[] binaryArray = new int[1000];
        for (int i = 0; i < binaryArray.length - 1; i++) {
            binaryArray[i] = random.nextInt(2);
        }

        System.out.println(Arrays.toString(binaryArray));

        for (int i : binaryArray) {
            if (i == 1) {
                counter += 1;
            } else {
                result = result > counter ? result : counter;
                //(условие) ? true : false

/*                if (result > counter) {
                    result = result;
                } else {
                    result = counter;
                }*/

                result = Math.max(result, counter);
                counter = 0;
            }
        }
        System.out.println(Math.max(result, counter));
    }
    static void ex3() {
        Random random = new Random();
        int[] arr = new int[20];
        final int VAL = 3;
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(1, 6);
        }
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[right] == VAL) {
                right--;
            } else if(arr[left] == VAL) {
                arr[left] = arr[right];
                arr[right] = VAL;
                right--;
                left++;
            } else if (arr[left] != VAL) {
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

