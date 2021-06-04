package com.girish.creationaldesignpattern.builder;

import java.io.Serializable;

public class Address implements Serializable {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public Address() {}

    public Address(AddressBuilder addressBuilder) {
        this.addressLine1 = addressBuilder.addressLine1;
        this.addressLine2 = addressBuilder.addressLine2;
        this.city = addressBuilder.city;
        this.state = addressBuilder.state;
        this.zipcode = addressBuilder.zipcode;
        this.country = addressBuilder.country;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class AddressBuilder {
        private String addressLine1;
        private String addressLine2;
        private String city;
        private String state;
        private String zipcode;
        private String country;
        private Person1.Person1Builder person1Builder;

        public AddressBuilder() {
            this.addressLine1 = "";
            this.addressLine2 = "";
            this.city = "";
            this.state = "";
            this.zipcode = "";
            this.country = "";
        }

        public AddressBuilder(Person1.Person1Builder person1Builder) {
            this.person1Builder = person1Builder;
        }

        public Address build() {
            return new Address(this);
        }

        public AddressBuilder withAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public AddressBuilder withAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public AddressBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder withState(String state) {
            this.state = state;
            return this;
        }

        public AddressBuilder withZipcode(String zipcode) {
            this.zipcode = zipcode;
            return this;
        }

        public AddressBuilder withCountry(String country) {
            this.country = country;
            return this;
        }
        public Person1.Person1Builder addressBuild() {
            return this.person1Builder;
        }
    }
}
