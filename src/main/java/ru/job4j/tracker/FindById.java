package ru.job4j.tracker;

public class FindById implements UserAction {

    @Override
    public String name() {
        return "=== find an Item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== find an Item ===");
        int id = input.askInt("Enter ID: ");
        Item itemById = tracker.findById(id);
        if (itemById != null) {
            System.out.print("ID: " + itemById.getId() + "; ");
            System.out.println("Name: " + itemById.getName());
        } else {
            System.out.println("Item  id " + id + "not found");
        }
        return true;
    }
}
