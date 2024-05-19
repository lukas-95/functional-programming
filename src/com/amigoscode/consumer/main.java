package com.amigoscode.consumer;

import java.util.List;
import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {
        //sendEmail("hello@lucas.com");
       sendEmailConsumer.accept("jamila@lucas.com");
        List<String> emails = List.of(
                "hello@lucas.com",
                "sup@lucas.com",
                "hi@lucas.com"
        );
emails.forEach(main::sendEmail);
    }


    static Consumer<String> sendEmailConsumer = email -> System.out.println("sending email to " + email);


    static void sendEmail(String email) {
        System.out.println("sending email to " + email);
    }
}
