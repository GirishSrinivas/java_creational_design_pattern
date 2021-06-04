package com.girish.creationaldesignpattern.builder;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person1 implements Serializable {
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
        private Date dateOfBirth;
        private Address.AddressBuilder addressBuilder;
        private PhoneNumber.PhoneNumberBuilder phoneNumberBuilder;
        private String email;

        public Person1Builder() {}

        public Person1 build() {
            Person1 person1 = new Person1();
            person1.name = this.nameBuilder.build();
            person1.phoneNumber = this.phoneNumberBuilder.build();
            person1.address = this.addressBuilder.build();
            person1.dateOfBirth = this.dateOfBirth;
            person1.email = this.email;
            return person1;
        }

        public Name.NameBuilder withName() {
            this.nameBuilder = new Name.NameBuilder(this);
            return this.nameBuilder;
        }

        public Address.AddressBuilder withAddressBuilder() {
            this.addressBuilder = new Address.AddressBuilder(this);
            return this.addressBuilder;
        }

        public PhoneNumber.PhoneNumberBuilder withPhoneNumber() {
            this.phoneNumberBuilder = new PhoneNumber.PhoneNumberBuilder(this);
            return this.phoneNumberBuilder;
        }

        public Person1Builder withDateOfBirth(String date) throws ParseException {
            this.dateOfBirth = new SimpleDateFormat("MM-dd-yyyy").parse(date);
            return this;
        }

        public Person1Builder withEmail(String email) {
            this.email = email;
            return this;
        }
    }
}
