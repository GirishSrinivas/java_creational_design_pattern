package com.girish.creationaldesignpattern.builder;

public class PhoneNumber {
    private Integer countryCode;
    private Integer areaCode;
    private Integer exchangeCode;
    private Integer lineNumber;

    public PhoneNumber() {}

    public PhoneNumber(PhoneNumberBuilder phoneNumberBuilder) {
        this.countryCode = phoneNumberBuilder.countryCode;
        this.areaCode = phoneNumberBuilder.areaCode;
        this.exchangeCode = phoneNumberBuilder.exchangeCode;
        this.lineNumber = phoneNumberBuilder.lineNumber;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public Integer getExchangeCode() {
        return exchangeCode;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", areaCode=" + areaCode +
                ", exchangeCode=" + exchangeCode +
                ", lineNumber=" + lineNumber +
                '}';
    }

    public static class PhoneNumberBuilder {
        private Integer countryCode;
        private Integer areaCode;
        private Integer exchangeCode;
        private Integer lineNumber;
        private Person1.Person1Builder person1Builder;

        public PhoneNumberBuilder() {}

        public PhoneNumberBuilder(Person1.Person1Builder person1Builder) {
            this.person1Builder = person1Builder;
        }

        public PhoneNumber build() {
            return new PhoneNumber(this);
        }

        public PhoneNumberBuilder withCountryCode(Integer countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public PhoneNumberBuilder withAreaCode(Integer areaCode) {
            this.areaCode = areaCode;
            return this;
        }

        public PhoneNumberBuilder withExchangeCode(Integer exchangeCode) {
            this.exchangeCode = exchangeCode;
            return this;
        }

        public PhoneNumberBuilder withLineNumber(Integer lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }

        public Person1.Person1Builder phoneNumberBuild() {
            return this.person1Builder;
        }
    }
}
