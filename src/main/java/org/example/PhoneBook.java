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
}
