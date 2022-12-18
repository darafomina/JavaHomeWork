package HomeWork4;

import java.util.LinkedList;
import java.util.Scanner;
public class MyStack {
    //2. В шаблоне MyStack с урока реализовать методы
    private static LinkedList<String> stack = new LinkedList<>();
    public static void main(String[] args) {
        push();
        System.out.println("LinkedList: " + stack);
        System.out.println("Последний элемент (метод peek): " + peek());
        System.out.println("Посмотреть и извлечь последний элемент из стека(метод pop): " + pop());
        System.out.println("LinkedList без последнего элемента (после применения метода pop): " + stack);
    }
    private static boolean push() { //добавить в конец
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите новый элемент массива, для выхода введите слово exit: ");
            String text = scanner.nextLine();
            if (text.equals("exit")) {
                return false;
            }
            stack.addLast(text);
        }
    }
    private static String peek() { // l.get(l.size -1) - просмотр последнего элемента
        return (String) stack.getLast();
    }
    private static String pop() { //l.get(l.size -1); l.set(l.size -1, null) - достаёт и обнуляет последний элемент
        return (String) stack.removeLast();
    }

}
