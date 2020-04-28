package com.girish.creationaldesignpattern.abstractFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());
    }
}
