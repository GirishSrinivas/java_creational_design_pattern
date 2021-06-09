package com.girish.creationaldesignpattern.builder.Person;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.ParseException;

public class Person1BeanApp {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            Person1 person = new Person1.Person1Builder()
                            .addName()
                                .withFirstName("Girish")
                                .withLastName("Srinivas")
                                .nameBuild()
                            .addAddressBuilder()
                                .withAddressLine1("11322 Franklin Plz")
                                .withAddressLine2("Apt 920")
                                .withCity("Omaha")
                                .withState("NE")
                                .withZipcode("68154")
                                .withCountry("US")
                                .addressBuild()
                            .addPhoneNumber()
                                .withCountryCode(1)
                                .withAreaCode(402)
                                .withExchangeCode(973)
                                .withLineNumber(4086)
                                .phoneNumberBuild()
                            .withDateOfBirth("01-18-1991")
                            .withEmail("girish.s.srinivas@gmail.com")
                            .buildPerson();
            System.out.println("Person Object...");
            System.out.println(person);
            System.out.println();

            System.out.println("Name Object");
            System.out.println(person.getName());
            System.out.println();

            System.out.println("Address Object...");
            System.out.println(person.getAddress());
            System.out.println();

            System.out.println("Phone Number Object");
            System.out.println(person.getPhoneNumber());
            System.out.println();

            System.out.println("Date of Birth: " +person.getDateOfBirth());
            System.out.println("Email: " + person.getEmail());
            System.out.println();

            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(person);
            System.out.println(json);

        } catch (ParseException | JsonProcessingException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Time taken to execute: " + (System.currentTimeMillis() - start) + " ms.");
        }

    }
}
