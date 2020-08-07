package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int number = 0;
        Item[] result = new Item[size];
        for (int index = 0; index != size; index++) {
            if (this.items[index].getName().equals(key)) {
                result[number++] = this.items[index];
            }
        }
        return Arrays.copyOf(result, number);
    }


    public boolean replace(int id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        for (; index < size; index++) {
            if (items[index].equals(id)) {
                this.items.add(index, item);
                result = true;
                item.setId(id);
                break;
            }
        }
        return result;
    }


    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

}