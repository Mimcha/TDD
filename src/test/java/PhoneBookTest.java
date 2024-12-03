import org.example.PhoneBook;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("John Doe", "123456789");
        assertEquals(0, result); // Проверка, что метод возвращает 0
    }
    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "123456789");
        phoneBook.add("Jane Doe", "987654321");

        assertEquals("John Doe", phoneBook.findByNumber("123456789")); // Проверяем поиск по номеру
        assertEquals("Jane Doe", phoneBook.findByNumber("987654321")); // Проверяем поиск по номеру
        assertNull(phoneBook.findByNumber("000000000")); // Проверяем номер, которого нет
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "123456789");
        phoneBook.add("Jane Doe", "987654321");

        assertEquals("123456789", phoneBook.findByName("John Doe")); // Проверяем поиск по имени
        assertEquals("987654321", phoneBook.findByName("Jane Doe")); // Проверяем поиск по имени
        assertNull(phoneBook.findByName("Non Existent")); // Проверяем имя, которого нет
    }

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John Doe", "123456789");
        phoneBook.add("Jane Doe", "987654321");
        phoneBook.add("Alice Smith", "555555555");

        // Перенаправляем вывод в поток и проверяем
        String expectedOutput = "Alice Smith\nJane Doe\nJohn Doe\n";
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        phoneBook.printAllNames();

        assertEquals(expectedOutput, outContent.toString()); // Проверяем вывод имен
    }
}