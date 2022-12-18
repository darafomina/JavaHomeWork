package HomeWork4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class MyQueue {
    private static Queue<String> queue = new LinkedList<>();
    public static void main(String[] args) {
        add();
        System.out.println("Queue: " + queue);
        System.out.println("Первый элемент в очереди (метод top): " + top());
        System.out.println("Извлечь и вернуть первый элемент в очереди (метод poll): " + remove());
        System.out.println("Queue без первого элемента (после применения метода remove/poll): " + queue);
    }
    private static boolean add() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите новый элемент массива, для выхода введите слово exit: ");
            String text = scanner.nextLine();
            if (text.equals("exit")) {
                return false;
            }
            queue.offer(text);
        }
    }
    private static String top() {
        return queue.peek();
    }
    private static String remove() {
        return queue.poll();
    }
}
