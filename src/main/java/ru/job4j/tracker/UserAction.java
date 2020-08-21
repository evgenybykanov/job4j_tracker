package ru.job4j.tracker;

public interface UserAction {
    String name();

    boolean addItem(Input input, Tracker tracker);

    boolean findAll(Tracker tracker);

    boolean editItem(Input input, Tracker tracker);

    boolean deleteItem(Input input, Tracker tracker);

    boolean findByName(Input input, Tracker tracker);
}
