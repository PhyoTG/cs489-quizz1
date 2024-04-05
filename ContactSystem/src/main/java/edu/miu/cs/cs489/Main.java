package edu.miu.cs.cs489;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.miu.cs.cs489.model.Contact;
import edu.miu.cs.cs489.model.Email;
import edu.miu.cs.cs489.model.PhoneNumber;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        System.out.println("This is Contact System!");
        List<Contact> contactsData = new ArrayList<>();
        contactsData.add(new Contact(3128874119L, "Banana", "Banana", "MIU", "Developer"));
        contactsData.add(new Contact(2927458265L, "Apple", "Apple", "MIU", "Analyst"));
        contactsData.add(new Contact(9189927460L, "Carrot", "Carrot", "MIU", "Product Owner"));
        contactsData.get(0).insertEmail(new Email(1128874129L,"Work",111111111L,"banana@gmail.com"));
        contactsData.get(1).insertEmail(new Email(2222222222L,"Work",2222222221L,"apple@gmail.com"));
        contactsData.get(2).insertEmail(new Email(3222222222L,"Work",3222222221L,"carrot@gmail.com"));

        contactsData.get(0).insertPhone(new PhoneNumber(3222222221L,"Mobile",3222222224L,"123456789"));
        contactsData.get(1).insertPhone(new PhoneNumber(3422222221L,"Mobile",3422222224L,"123456799"));
        contactsData.get(2).insertPhone(new PhoneNumber(3522222221L,"Mobile",3522222224L,"123456788"));
        printContacts(contactsData);
    }

    public static void printContacts(List contacts) {

        // Print contacts in JSON format
        System.out.println("Printed in JSON format:");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(contacts);
        System.out.println(json);
    }
}