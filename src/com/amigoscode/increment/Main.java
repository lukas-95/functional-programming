package com.amigoscode.increment;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {

      Person jamila = personMapperBiFunc.apply("Lucas", 27);
        System.out.println(jamila);




    }

    record Person(String name, int age){}

    static BiFunction<String, Integer, Person> personMapperBiFunc = Person::new;




//this is a normal method from the BiFunction above.
    static Person personMapper (String name, int age){
        return new Person(name, age);
    }

}
