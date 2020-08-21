package ru.job4j.tracker;

public class ReplaceAction implements UserAction {

    @Override
    public String name() {
        return "=== Replase a new Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== replase an Item ===");
        int id = input.askInt("Enter ID: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item change");
        } else {
            System.out.println("Item on id " + id + "not found");
        }
        return true;
    }
}
