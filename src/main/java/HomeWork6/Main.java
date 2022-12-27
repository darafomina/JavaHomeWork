package HomeWork6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HUAWEI", "Intel Core i5 i5-1135G7 2.4 ГГц", 512, 8, "Silver", 56999);
        Laptop laptop2 = new Laptop("Thunderobot", "Intel Core i5 11260H 2.6 ГГц", 256, 8, "Black", 54999);
        Laptop laptop3 = new Laptop("Apple", "Apple M1", 256, 8, "Gold", 80999);
        Laptop laptop4 = new Laptop("Lenovo", "Intel Core i5 1135G7 2.4 ГГц", 256, 8, "Black", 39999);
        Laptop laptop5 = new Laptop("Xiaomi", "Intel Core i3 1115G4 3.0 ГГц", 512, 8, "Black", 39999);

        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        laptopArrayList.add(laptop1);
        laptopArrayList.add(laptop2);
        laptopArrayList.add(laptop3);
        laptopArrayList.add(laptop4);
        laptopArrayList.add(laptop5);

        for (Laptop laptop : laptopArrayList) {
            laptop.printInfo(0, "");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Минимальный размер оперативной памяти(RAM): ");
        int userRam = scanner.nextInt();
        System.out.print("\nПод данный фильтр подходят ноутбуки:\n");
        for (Laptop laptop : laptopArrayList) {
            laptop.printInfo(userRam, "");

        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите цвет: ");
        String userColor = scanner2.nextLine();
        System.out.print("\nПод данный фильтр подходят ноутбуки:\n");
        for (Laptop laptop : laptopArrayList) {
            laptop.printInfo(0, userColor);
        }

        System.out.println("\nНоутбуки, подходящие под оба требования:\n");
        for (Laptop laptop : laptopArrayList) {
            laptop.printInfo(userRam, userColor);
        }
    }
}
