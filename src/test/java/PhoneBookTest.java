import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;


public class PhoneBookTest {

    @org.junit.jupiter.api.Test
    public void testPhonebookAdd() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Алексей", "1234567890");
        String userName = phoneBook.contacts.get("Алексей");
        Assertions.assertEquals("1234567890", userName);


    }
    @org.junit.jupiter.api.Test
    public void testPhonebookFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Алексей", "1234567890");
        String number = phoneBook.findByNumber("1234567890");
        Assertions.assertEquals("Алексей", number);
    }
    @org.junit.jupiter.api.Test
    public void testPhonebookFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Алексей", "1234567890");
        String number = phoneBook.findByName("Алексей");
        Assertions.assertEquals("1234567890", number);
    }
}
