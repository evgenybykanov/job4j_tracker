package ru.job4j.tracker;

public class FindByName implements UserAction {

    @Override
    public String name() {
        return "=== Find Item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find Item by name ===");
        String name = input.askStr("Enter name: ");
        Item[] itemsname = tracker.findByName(name);
        if (itemsname.length > 0) {
            for (Item item : itemsname) {
                System.out.print("ID: " + item.getId() + "; ");
                System.out.println("Name: " + item.getName());
            }
        }
        return true;
    }
}
