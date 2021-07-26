package ru.geekbrains.HomeWorkApp_java2_lesson1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[]{"Ауди","Мерседес","БМВ",
                "Инфинити","Лексус","Порше",
                "Ауди","Мерседес","БМВ",
                "Инфинити","Лексус","Порше","Ауди","Мерседес","БМВ",
                "Инфинити","Лексус","Порше","Ауди","Мерседес","БМВ",
                "Инфинити","Лексус","Порше","Ауди","Мерседес","БМВ",
                "Инфинити","Лексус","Порше","Ауди","Мерседес","БМВ",
                "Инфинити","Лексус","Порше"};

        Set<String> setWords = new HashSet<>();
        Collections.addAll(setWords, words);

        for(String word : setWords) {
            System.out.println(word);
        }

        Map<String, String> phonebook = new Phonebook();
        ((Phonebook) phonebook).add("Матвеев", "8996999999");
        ((Phonebook) phonebook).add("Геворгян", "896675852369");
        ((Phonebook) phonebook).add("Иванов", "91766582459");

        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            System.out.println("Name =  " + entry.getKey() + " Телефон = " + entry.getValue());
        }
        System.out.println(phonebook.get("Воронин"));
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