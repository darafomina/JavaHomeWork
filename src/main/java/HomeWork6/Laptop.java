package HomeWork6;

public class Laptop {

    private String brand;
    private String cpu;
    private int ssd;
    private int ram;
    private String color;
    private int price;

    public Laptop(String brand, String CPU, int SSD, int ram, String color, int price) {
        this.brand = brand;
        this.cpu = CPU;
        this.ssd = SSD;
        this.ram = ram;
        this.color = color;
        this.price = price;
    }

    public void printInfo(int userRam, String userColor) {
        if (ram >= userRam && (color.equals(userColor) | userColor == "")){
            System.out.printf("Ноутбук бренда %s.%n -Процессор: %s.%n -Объем SSD:  %s.%n -Оперативная память: %s.%n -Цвет: %s.%n -Цена: %s.%n\n", brand, cpu, ssd, ram, color, price);
        }
    }

    @Override
    public String toString() {
        return String.format("Ноутбук бренда %s. Процессор: %s. Объем SSD:  %s. Оперативная память: %s. Цвет: %s. Цена: %s%n", brand, cpu, ssd, ram, color, price);
    }
}
