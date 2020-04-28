package com.girish.creationaldesignpattern.abstractFactory;

public class AmexPlatinumValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        if(creditCard instanceof AmexPlatinumCreditCard) {
            return true;
        }
        return false;
    }
}
