import org.example.PhoneBook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("John Doe", "123456789");
        assertEquals(0, result); // Проверка, что метод возвращает 0
    }
}
