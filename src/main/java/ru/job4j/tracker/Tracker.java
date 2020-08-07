package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;
    private final int position = 0;
    private final String id = null;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        int number = 0;
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getName().equals(key)) {
                result[number++] = this.items[index];
            }
        }
        return result;
    }

    public Item findById(String id) {
        Item item = null;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals) {
                item = this.items[index];
            }
        }
        return item;
    }

}