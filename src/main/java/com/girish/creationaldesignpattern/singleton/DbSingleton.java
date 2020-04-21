package com.girish.creationaldesignpattern.singleton;

public class DbSingleton {
    private static DbSingleton instance = new DbSingleton();

    private DbSingleton() {}

    public static DbSingleton getInstance(){
        return instance;
    }
}
