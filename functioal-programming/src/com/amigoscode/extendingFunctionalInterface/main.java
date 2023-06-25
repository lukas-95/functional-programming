package com.amigoscode.extendingFunctionalInterface;

import java.util.function.Consumer;

public class main {
    public static void main(String[] args) {

hello("Lucas", "Reck", cb);

    }
/*
const cb = ( firstName) => {
        console.log(firstName + " tell us your lastName")
    }
 */
    static Consumer<String> cb = input -> System.out.println(input + " tell us your lastName");

    static void hello (String firstName, String lastName, Consumer<String> callback){
        System.out.println(firstName);
        if (lastName != null){
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

/*
    const hello = (firstName, lastName, callback) => {
        console.log(firstName);
        if (lastName){
            console.log(lastName);
        } else {
            callback(firstName);
        }

    }

const cb = ( firstName) => {
        console.log(firstName + " tell us your lastName")
    }

    hello('Lucas', null, cb)

["foo", 'bar'].map((v, index)=>{
        console.log(v)
    })

*/

/*
      Person lucas = new Person(
              "Lucas",
              "+551198867102,",
              "lucas@lucas.com"
      );
 Person alex = new Person(
              "Alez",
              "0+550000",
              "alexlucas.com"
      );

        PersonRegistrationValidator validator = PersonRegistrationValidator
                .isEmailTaken()
                .and(PersonRegistrationValidator.isPhoneNumerValid())
                .and(PersonRegistrationValidator.isEmailValid());


        PersonRegistrationValidator.ValidationResult result = validator.apply(lucas);
        if (result != PersonRegistrationValidator.ValidationResult.SUCCESS){
            throw new RuntimeException("this is a homemade error");
        }


        System.out.println(result);
        System.out.println(validator.apply(alex));

    }*/
}
