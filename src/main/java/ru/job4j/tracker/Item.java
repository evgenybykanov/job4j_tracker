package ru.job4j.tracker;

public class Item {
    private int id;
    private int name;

    public Item() {
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Item(int name) {
        this.name = name;
    }

    public Item(int name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void print() {
    }

}


