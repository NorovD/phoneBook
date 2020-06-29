package ru.geekbrains.homework.phoneBook;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {

    private final HashMap<String, HashSet<String >> phoneBook;

    public PhoneBook(){
        this.phoneBook= new HashMap<>();
    }

    public void addPhoneNumber(String name, String phoneNumber){
        HashSet<String> phones = phoneBook.getOrDefault(name,new HashSet<>());
        phones.add(phoneNumber);
        phoneBook.put(name,phones);

    }
    public void getPhoneNumber(String name){
        if(phoneBook.containsKey(name)){
            System.out.println(phoneBook.get(name));
        }


    }




}

