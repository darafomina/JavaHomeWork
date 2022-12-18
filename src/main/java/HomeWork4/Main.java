package HomeWork4;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    /**  1.Пусть дан LinkedList с несколькими элементами.
     * Реализуйте метод, который вернет “перевернутый” список.*/
    private static LinkedList list = new LinkedList();
    public static void main(String[] args) {
        push();
        System.out.println("LinkedList: " + list);
        ex();
    }
    private static boolean push() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите новый элемент массива, для выхода введите слово exit: ");
            String text = scanner.nextLine();
            if (text.equals("exit")) {
                return false;
            }
            list.addLast(text);
        }
    }
    private static void ex() {
        for(int i = list.size()-1; i>=0; i--){
            if(i == 0) {
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
