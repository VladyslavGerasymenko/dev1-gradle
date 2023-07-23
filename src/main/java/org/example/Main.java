package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Name name = new Name("Vladyslav", "Gerasymenko");

        Gson g = new Gson();
        System.out.println(g.toJson(name));


    }
}