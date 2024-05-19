package com.amigoscode.supplier;

import java.util.List;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {

        System.out.println(getUrlSupplier.get());

    }


    static Supplier<List<String>> getUrlSupplier =
            () -> {


        return List.of( "hhtps://lucas.com");


            };


    static String getUrl(){
        return "hhtps://lucas.com";
    }
}
