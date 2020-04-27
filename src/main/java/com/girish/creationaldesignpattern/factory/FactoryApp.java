package com.girish.creationaldesignpattern.factory;

public class FactoryApp {
    public static void main(String[] args) {
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        if(website != null) {
            System.out.println(website.getPages());
        }

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        if(website != null) {
            System.out.println(website.getPages());
        }

    }
}
