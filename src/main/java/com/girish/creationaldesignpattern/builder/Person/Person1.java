package com.girish.creationaldesignpattern.builder.Person;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Person1 implements Serializable {
    private static final long serialVersionUID = 6706165017181525293L;
    private Name name;
    private Date dateOfBirth;
    private Address address;
    private PhoneNumber phoneNumber;
    private String email;

    public Name getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name=" + name +
                "\ndateOfBirth=" + dateOfBirth +
                "\naddress=" + address +
                "\nphoneNumber=" + phoneNumber +
                "\nemail='" + email + '\'' +
                '}';
    }

    public static class Person1Builder {
        private Name.NameBuilder nameBuilder;
        private Address.AddressBuilder addressBuilder;
        private PhoneNumber.PhoneNumberBuilder phoneNumberBuilder;

        private Name name;
        private Date dateOfBirth;
        private Address address;
        private PhoneNumber phoneNumber;
        private String email;

        private static final String DATE_FORMAT = "MM-dd-yyyy";

        public Person1Builder() throws ParseException {
            this.dateOfBirth = new SimpleDateFormat(DATE_FORMAT).parse("01-01-0001");
            this.email = "";
        }

        public Person1 build(){
            Person1 person = new Person1();
            person.name = this.name;
            person.address = this.address;
            person.phoneNumber = this.phoneNumber;
            person.email = this.email;
            person.dateOfBirth = this.dateOfBirth;
            return person;
        }

        public Person1 buildPerson() {
            Person1 person1 = new Person1();
            person1.name = this.nameBuilder.build();
            person1.phoneNumber = this.phoneNumberBuilder.build();
            person1.address = this.addressBuilder.build();
            person1.dateOfBirth = this.dateOfBirth;
            person1.email = this.email;
            return person1;
        }

        public Name.NameBuilder addName() {
            this.nameBuilder = new Name.NameBuilder(this);
            return this.nameBuilder;
        }

        public Address.AddressBuilder addAddressBuilder() {
            this.addressBuilder = new Address.AddressBuilder(this);
            return this.addressBuilder;
        }

        public PhoneNumber.PhoneNumberBuilder addPhoneNumber() {
            this.phoneNumberBuilder = new PhoneNumber.PhoneNumberBuilder(this);
            return this.phoneNumberBuilder;
        }

        public Person1Builder withName(Name name) {
            this.name = name;
            return this;
        }

        public Person1Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public Person1Builder withPhoneNumber(PhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person1Builder withDateOfBirth(String date) throws ParseException {
            this.dateOfBirth = new SimpleDateFormat(DATE_FORMAT).parse(date);
            return this;
        }

        public Person1Builder withEmail(String email) {
            this.email = email;
            return this;
        }
    }
}
