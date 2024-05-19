package com.amigoscode.consumer;

import java.util.function.BiConsumer;

public class exerciseConsumer {
    public static void main(String[] args) {

        sendEmailBiConsumer.accept(
                "hello@lucas.code",
                "alex@lucas.com"
        );




    }


    static BiConsumer<String,String> sendEmailBiConsumer = (from,to) -> System.out.println("Sending email from " + from + " to " + to);



    static void sendEmail(String from, String to) {
        System.out.println("Sending email from " + from + " to " + to);
    }
}
