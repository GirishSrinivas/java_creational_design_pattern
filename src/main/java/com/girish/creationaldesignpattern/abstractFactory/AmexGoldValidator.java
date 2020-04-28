package com.girish.creationaldesignpattern.abstractFactory;

public class AmexGoldValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        if(creditCard instanceof AmexGoldCreditCard) {
            return true;
        }
        return false;
    }
}
