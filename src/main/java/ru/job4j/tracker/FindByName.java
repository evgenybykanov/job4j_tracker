package ru.job4j.tracker;

public class FindByName implements UserAction {

    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find Item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
     out.println("=== Find Item by name ===");
        String name = input.askStr("Enter name: ");
        Item[] itemsname = tracker.findByName(name);
        if (itemsname.length > 0) {
            for (Item item : itemsname) {
                out.println("ID: " + item.getId() + "; ");
                out.println("Name: " + item.getName());
            }
        }
        return true;
    }
}
