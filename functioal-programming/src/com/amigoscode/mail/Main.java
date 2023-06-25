package com.amigoscode.mail;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Lucas","Monica", "Pafuncio");
        Consumer<String> stringConsumer = System.out::println;

        //names.forEach(stringConsumer);
        names.forEach (name -> System.out.println(name));



    }
}
