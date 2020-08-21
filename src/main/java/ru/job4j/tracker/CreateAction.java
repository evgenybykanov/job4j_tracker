package ru.job4j.tracker;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean addItem(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }

    @Override
    public boolean findAll(Tracker tracker) {
        tracker.findAll();
        return true;
    }

    @Override
    public boolean editItem(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        int id = input.askInt("Enter ID: ");
        Item item = new Item(name);
        tracker.replace(id, item);
        return true;
    }

    @Override
    public boolean deleteItem(Input input, Tracker tracker) {
        int id = input.askInt("Enter ID: ");
        tracker.delete(id);
        return true;
    }

    @Override
    public boolean findByName(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.findByName(name);
        return true;
    }


}
