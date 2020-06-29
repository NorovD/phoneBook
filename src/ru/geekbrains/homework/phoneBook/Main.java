package ru.geekbrains.homework.phoneBook;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] wordsArray = {"sadasd", "dfsdfdf", "evrvr", "fgdfsagsdfg", "sdfsdf", "sdfsdh", "evrvr", "sdfcvcv", "evrvr", "sdfse", "efwef", "xcvrve"};
        wordsCounter(wordsArray);
        unicWords(wordsArray);
        PhoneBook page1 = new PhoneBook();
        page1.addPhoneNumber("Ivan","534-12-12");
        page1.addPhoneNumber("Oleg","534-15-12");
        page1.addPhoneNumber("Igor","534-11-12");
        page1.addPhoneNumber("Vika","534-16-12");
        page1.addPhoneNumber("Hleb","534-175-12");
        page1.addPhoneNumber("Capa","534-12212");
        page1.addPhoneNumber("Boris","534-111-12");

        page1.getPhoneNumber("Hleb");


    }
    public static void wordsCounter(String[] wordsArray) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String o : wordsArray) {
            hm.put(o, hm.getOrDefault(o, 0) + 1);


        }
        System.out.println(hm);
    }
    public static void unicWords(String[] wordsArray){
        HashMap<String, Integer> hm = new HashMap<>();
        for (String o : wordsArray) {
            hm.put(o, hm.getOrDefault(o, 0) + 1);
            Integer res = hm.get(o);
            if(res>1){
                hm.remove(o);
            }
        }
        System.out.println(hm);
    }
}
