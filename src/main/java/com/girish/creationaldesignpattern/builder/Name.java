package com.girish.creationaldesignpattern.builder;

import java.io.Serializable;

public class Name implements Serializable {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name() {}

    public Name(NameBuilder nameBuilder) {
        this.firstName = nameBuilder.firstName;
        this.middleName = nameBuilder.middleName;
        this.lastName = nameBuilder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class NameBuilder {
        private String firstName;
        private String middleName;
        private String lastName;
        private Person1.Person1Builder person1Builder;

        public NameBuilder() {
            this.firstName = "";
            this.lastName = "";
            this.middleName = "";
        }

        public NameBuilder(Person1.Person1Builder person1Builder) {
            this.person1Builder = person1Builder;
        }

        public Name build() {
             return new Name(this);
        }

        public NameBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public NameBuilder withMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public NameBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person1.Person1Builder nameBuild() {
            return this.person1Builder;
        }
    }
}
