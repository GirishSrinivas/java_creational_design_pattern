package com.girish.creationaldesignpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<ItemType, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(ItemType type) {
        Item item = null;

        try {
            item = (Item)(items.get(type).clone());
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setUnitPrice(24.99);
        movie.setRuntime("2 hours");
        items.put(ItemType.MOVIE, movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setNumberOfPages(335);
        book.setUnitPrice(19.99);
        items.put(ItemType.BOOK, book);
    }
}
