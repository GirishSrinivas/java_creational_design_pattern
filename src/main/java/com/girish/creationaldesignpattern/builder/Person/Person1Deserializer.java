package com.girish.creationaldesignpattern.builder.Person;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Person1Deserializer {
    public static void main(String[] args) {
        String json = "{\"name\":{\"firstName\":\"Girish\",\"middleName\":\"\",\"lastName\":\"Srinivas\"},\"dateOfBirth\":664178400000,\"address\":{\"addressLine1\":\"11322 Franklin Plz\",\"addressLine2\":\"Apt 920\",\"city\":\"Omaha\",\"state\":\"NE\",\"zipcode\":\"68154\",\"country\":\"US\"},\"phoneNumber\":{\"countryCode\":1,\"areaCode\":402,\"exchangeCode\":973,\"lineNumber\":4086},\"email\":\"girish.s.srinivas@gmail.com\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            Person1 person = mapper.readValue(json, Person1.class);
            System.out.println("Success");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
