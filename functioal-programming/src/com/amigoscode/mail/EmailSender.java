package com.amigoscode.mail;

@FunctionalInterface
public interface EmailSender {
    void send(String from, String to);


}
