package ru.job4j.tracker;

public class FindById implements UserAction {

    private final Output out;

    public FindById(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== find an Item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== find an Item ===");
        int id = input.askInt("Enter ID: ");
        Item itemById = tracker.findById(id);
        if (itemById != null) {
            out.println("ID: " + itemById.getId() + "; ");
            out.println("Name: " + itemById.getName());
        } else {
            out.println("Item  id " + id + "not found");
        }
        return true;
    }
}
