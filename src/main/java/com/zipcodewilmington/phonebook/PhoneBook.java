package com.zipcodewilmington.phonebook;

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
    private TreeMap<String, String> book = new TreeMap<String, String>();

    //lookup method
    public void lookup() {
        //
    }

    //add method
    public void add(String name, String number) {
        this.book.put(name, number);
        System.out.println(this.book);
    }

    //remove method
    public void remove() {
        //
    }

    //display() method
    public void display() {
        //
    }

    public static void main(String []args) {
        // Following statement would create an object myPuppy
        PhoneBook test = new PhoneBook();
        test.add("Daniel", "717-555-5555");
    }
}
