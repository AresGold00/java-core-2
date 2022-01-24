package HomeWork3;

import java.util.HashMap;
import java.util.Map;

public class Hw3 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Move", "Potato", "Alpha",
                "Cheese", "Beta", "Humster",
                "Dog", "Smoke", "Javana",
                "Yava", "Kent", "Coffee",
                "smile", "Beta", "Humster",
                "like", "Java", "Pepper", "Snow"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Johnson", "8999123321");
        directory.add("Brown", "8912155326");
        directory.add("Abobov", "8917155552");
        directory.add("lobov", "8913455672");
        directory.add("antonyan", "899999999");
        directory.add("Medvedev", "899111111");
        directory.add("Muratidis", "89923231999");
        directory.add("Parasidis", "8888123113");
        directory.add("Smith ", "8324325234");

        System.out.println(directory.get("Muratidis"));
        System.out.println(directory.get("Johnson"));
        System.out.println(directory.get("Parasidis"));
        System.out.println(directory.get("Medvedev"));
    }
}



