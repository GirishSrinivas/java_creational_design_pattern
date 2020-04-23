package com.girish.creationaldesignpattern.builder;

public class LunchOrderBeanApp {
    public static void main(String[] args) {
        LunchOrderBean.Builder lunchBuilder = new LunchOrderBean.Builder();
        lunchBuilder.bread("Wheat")
                    .condiments("Lettuce")
                    .dressing("Ranch")
                    .meat("Chicken")
                    ;

        LunchOrderBean lunchOrder = lunchBuilder.build();

        System.out.println(lunchOrder);
    }
}
