package com.girish.creationaldesignpattern.abstractFactory;

public class VisaValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        if((creditCard instanceof VisaCreditCard)
                || (creditCard instanceof VisaGoldCreditCard)
                || (creditCard instanceof VisaBlackCreditCard)) {
            return true;
        }
        return false;
    }
}
