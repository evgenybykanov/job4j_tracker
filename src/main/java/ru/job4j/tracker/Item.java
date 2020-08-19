package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}


