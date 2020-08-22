package ru.job4j.tracker;

public class FindAllAction implements UserAction {

    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Show all Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all Items ====");
        Item[] findAll = tracker.findAll();
        if (findAll.length > 0) {
            for (Item item : findAll) {
               out.println("ID: " + item.getId() + "; ");
                out.println("Name: " + item.getName());
            }
        }
        return true;
    }
}


