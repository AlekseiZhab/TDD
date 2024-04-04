import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;


public class PhoneBookTest {

    @org.junit.jupiter.api.Test
    public void testPhonebookAdd() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Алексей", "1234567890");
        String username = phoneBook.contacts.get("Алексей");
        Assertions.assertEquals("1234567890", username);


    }
}
