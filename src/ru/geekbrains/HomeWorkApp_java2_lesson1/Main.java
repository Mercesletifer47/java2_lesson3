package ru.geekbrains.HomeWorkApp_java2_lesson1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Ауди", "Мерседес", "БМВ",
                "Инфинити", "Лексус", "Порше",
                "Ауди", "Мерседес", "БМВ",
                "Инфинити", "Лексус", "Порше", "Ауди", "Мерседес", "БМВ",
                "Инфинити", "Лексус", "Порше", "Ауди", "Мерседес", "БМВ",
                "Инфинити", "Лексус", "Порше", "Ауди", "Мерседес", "БМВ",
                "Инфинити", "Лексус", "Порше", "Ауди", "Мерседес", "БМВ",
                "Инфинити", "Лексус", "Порше"};

        Map<String, Integer> hmap = new HashMap<>();
        for (String x : words) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hmap);


        Map<String, String> phonebook = new Phonebook();
        ((Phonebook) phonebook).add("Матвеев", "8996999999");
        ((Phonebook) phonebook).add("Геворгян", "896675852369");
        ((Phonebook) phonebook).add("Матвеев", "91766582459");

        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            System.out.println("Name =  " + entry.getKey() + " Телефон = " + entry.getValue());
        }
        System.out.println(phonebook.get("Матвеев"));
    }
}

class Phonebook extends TreeMap {
    public void add (String name, String phone){
        if(this.containsKey(name)) {
            this.put(name, this.get(name) + "," + phone);
        } else {
            this.put(name, phone);
        }
    }
}