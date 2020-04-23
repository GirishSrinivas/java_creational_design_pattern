package com.girish.creationaldesignpattern.builder;

public class JavaStringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("This is an example ");
        builder.append("of the builder pattern.");
        builder.append("It has methods to append ");
        builder.append(618);
        System.out.println(builder.toString());
    }
}
