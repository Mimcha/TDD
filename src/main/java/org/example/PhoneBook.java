package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class PhoneBook {
    // Храним контакты в HashMap
    private final Map<String, String> contacts = new HashMap<>();
    // Для хранения имен в алфавитном порядке
    private final TreeSet<String> names = new TreeSet<>();

    // Метод добавления имени с номером
    public int add(String name, String phone) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, phone);
            names.add(name);
        }
        return contacts.size(); // Возвращаем количество уникальных контактов
    }

    // Метод поиска имени по номеру
    public String findByNumber(String phone) {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals(phone)) {
                return entry.getKey(); // Возвращаем имя, если номер найден
            }
        }
        return null; // Если номер не найден
    }

    // Метод поиска номера по имени
    public String findByName(String name) {
        return contacts.get(name); // Возвращаем номер, если имя найдено
    }

    // Метод вывода всех имен в алфавитном порядке
    public void printAllNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
