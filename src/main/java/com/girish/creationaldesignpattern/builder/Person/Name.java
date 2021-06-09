package com.girish.creationaldesignpattern.builder.Person;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.io.Serializable;

@JsonDeserialize(builder = Name.NameBuilder.class)
public class Name implements Serializable {
    private static final long serialVersionUID = 3282779056068827843L;
    private final String firstName;
    private final String middleName;
    private final String lastName;

    private Name(NameBuilder nameBuilder) {
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

    @JsonPOJOBuilder
    public static class NameBuilder {
        private String firstName;
        private String middleName;
        private String lastName;
        private Person1.Person1Builder person1Builder;

        public NameBuilder(Person1.Person1Builder person1Builder) {
            this.person1Builder = person1Builder;
            this.firstName = "";
            this.middleName = "";
            this.lastName = "";
        }

        public NameBuilder() {}

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
