package org.example;
import java.util.HashMap;

public class PhoneBook {
    public HashMap<String, String> contacts = new HashMap<>();

    public void add(String name, String number) {
        contacts.put(name, number);
    }
}
