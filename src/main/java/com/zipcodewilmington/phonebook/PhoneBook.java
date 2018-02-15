package com.zipcodewilmington.phonebook;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Set;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    //variables
    private String name;
    private String phoneNumber;
    //Tree map to hold names and numbers
    private SortedMap<String, String> book = new TreeMap<String, String>();

    //lookup method
    public void lookup(String name) {
        String val = this.book.get(name);
        System.out.println(name + "'s number is: " + val);

    }

    //add method
    public void add(String name, String number) {
        this.book.put(name, number);
    }

    //remove method
    public void remove(String name) {
        //
        this.book.remove(name);
        System.out.println(name + "'s number has been removed");
    }

    //display() method
    public void display() {
        for(Map.Entry<String, String> entry : this.book.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String []args) {
        // Following statement would create an object myPuppy
        PhoneBook test = new PhoneBook();
        test.add("Daniel", "717-555-5555");
        test.add("Kelly", "717-666-5555");
        test.add("Alicia", "717-777-5555");
        test.lookup("Kelly");
        test.remove("Daniel");
        test.lookup("Daniel");
        test.add("Joe", "717-888-9999");
        test.display();

    }
}
