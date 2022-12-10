package HomeWork2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex1();
        repeatString();
        printIntoFile();
    }
    public static void ex1(){
        /*1. Напишите метод, который принимает на вход строку
        (String) и определяет является ли строка палиндромом (возвращает boolean значение)*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s=scan.next();
        isPalindrome(s);
    }
    public static String reverseString(String s){
        String str = "";
        for (int i = s.length() - 1; i >= 0; --i){
            str += s.charAt(i);
        }

        return str;
    }
    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Полиндром");
        }else{
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));
    }

    public static void repeatString(){
        /*2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
         и метод, который запишет эту строку в простой текстовый файл, обработайте исключения*/
        String text = "TEST".repeat(100);
    }
    public static void printIntoFile(){
        try(FileWriter writer = new FileWriter("C:\\Users\\Fomina\\Desktop\\Java\\untitled1\\src\\main\\resources\\directory\\test.txt", false))
        {
            // запись всей строки
            String text = "TEST".repeat(100);
            writer.write(text);
            // запись по символам
            writer.flush();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
