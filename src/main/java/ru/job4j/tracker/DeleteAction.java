package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Delete a new Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== input Item ===");
        int id = input.askInt("Enter ID: ");
        if (tracker.delete(id)) {
            out.println("Item delete");
        } else {
           out.println("Item on id " + id + "not found");
        }
        return true;
    }

}
