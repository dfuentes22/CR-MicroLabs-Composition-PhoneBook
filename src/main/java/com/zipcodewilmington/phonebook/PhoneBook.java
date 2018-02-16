package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    //variables
    private String name;
    private String phoneNumber;

    //Tree map to hold names and numbers
    private SortedMap<String, ArrayList<String>> book = new TreeMap<String, ArrayList<String>>();

    //add individual number
    public void add(String name, String number) {
        //if name already exists, add to existing list
        if (this.book.containsKey(name)){
            this.book.get(name).add(number);
        }
        //if name does not exist, create new list and add number
        else {
            this.book.put(name, new ArrayList<String>());
            this.book.get(name).add(number);
        }
    }

    //remove individual number method
    public void removeNumber(String name, String phoneNumber) {
        this.book.get(name).remove(phoneNumber);
        System.out.println(phoneNumber + " has been removed from " + name + "'s phone book.");
    }

    //remove an entire entry method
    public void removeRecord(String name) {
        this.book.remove(name);
        System.out.println(name + "'s number(s) has been removed");
    }

    //lookup method
    public void lookup(String name) {
        ArrayList<String> numbers = this.book.get(name);
        System.out.println(name + "'s numbers are: " + numbers);
    }

    //display() method
    public void display() {
        for(Map.Entry<String, ArrayList<String>> entry : this.book.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    //reverseLookup method
    public void reverseLookup(String number) {
        //loop through all phone book entries
        for(Map.Entry<String, ArrayList<String>> entry : this.book.entrySet()) {
            //loop through all the numbers of a single entry
            for(String item : entry.getValue()){
                //if a number in the list equals lookup number, print name and stop loop
                if(item.equals(number)){
                    System.out.println(entry.getKey());
                    break;
                }
            }

        }
    }

    public static void main(String []args) {
        // Following statement would create an object Phonebook
        PhoneBook test = new PhoneBook();
        test.add("Daniel", "717-555-5555");
        test.add("Daniel", "717-555-6666");
        test.add("Joe", "902-999-9999");
        test.add("Joe", "902-777-9999");
        test.add("Daniel", "717-111-8888");
        test.reverseLookup("717-111-8889");
    }
}
