package ru.job4j.tracker;

public class FindAllAction implements UserAction {

    @Override
    public String name() {
        return "=== Show all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all Items ====");
        Item[] findAll = tracker.findAll();
        if (findAll.length > 0) {
            for (Item item : findAll) {
                System.out.print("ID: " + item.getId() + "; ");
                System.out.println("Name: " + item.getName());
            }
        }
        return true;
    }
}


