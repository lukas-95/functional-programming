package com.amigoscode.predicateAndBiPredicate;

import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {

        var email = "lucas@lucas.com";
        //System.out.println(isValidEmail(email));

        System.out.println(isValidEmailPredicate.test(email));

        boolean test = isValidEmailPredicate
                .or(containsDotPredicate).test(email);

        System.out.println(test);

    }


    static Predicate<String> isValidEmailPredicate = email -> email.contains("@");

    static Predicate<String> containsDotPredicate = email -> email.contains(".");

    static boolean isValidEmail(String email) {
        return email.contains("@");
    }


}
