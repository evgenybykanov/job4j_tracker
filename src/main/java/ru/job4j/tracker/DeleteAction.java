package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    @Override
    public String name() {
        return "=== Delete a new Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== input Item ===");
        int id = input.askInt("Enter ID: ");
        if (tracker.delete(id)) {
            System.out.println("Item delete");
        } else {
            System.out.println("Item on id " + id + "not found");
        }
        return true;
    }

}
