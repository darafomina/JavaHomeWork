package HomeWork5;

import java.util.*;

public class Main {
    public static Map<String, ArrayList<String>> map = new HashMap<>();
    public static void main(final String[] args) {

        map.put("Тимофей",  new ArrayList<>());
        map.get("Тимофей").add("111");
        map.get("Тимофей").add("222");
        map.get("Тимофей").add("333");

        map.put("Яна",  new ArrayList<>());
        map.get("Яна").add("444");
        map.get("Яна").add("555");
        map.get("Яна").add("666");

        map.put("Дарья",  new ArrayList<>());
        map.get("Дарья").add("777");
        map.get("Дарья").add("888");
        map.get("Дарья").add("999");

        String name = getName();
        searchByName(name);
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = scanner.nextLine();
        return name;
    }

    public static void searchByName(String name) {
        StringJoiner joiner = new StringJoiner(", ");
        if (map.containsKey(name)) {
            System.out.printf(name + ": ");
            for (var phone : map.get(name)) {
                joiner.add(phone);
            }
        }
        else {
            System.out.println("Пользователь не найден ");
        }
        String result = joiner.toString();
        System.out.println(result);
    }
}
