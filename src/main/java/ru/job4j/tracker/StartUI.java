package ru.job4j.tracker;

import java.util.Scanner;

 public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.print(item);
                }
            } else if (select == 2) {
                System.out.println("=== Edit an Item ===");
                System.out.print("Enter ID: ");
                Scanner sc = new Scanner(System.in);
                int id = sc.nextInt();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.print("success." + System.lineSeparator());
                } else {
                    System.out.print("error." + System.lineSeparator());

                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                System.out.print("Enter ID: ");
                Scanner sc = new Scanner(System.in);
                int id = sc.nextInt();
                if (tracker.delete(id)) {
                    System.out.print("success." + System.lineSeparator());
                } else {
                    System.out.print(" error." + System.lineSeparator());
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by ID ===");
                System.out.print("Enter ID: ");
                Scanner sc = new Scanner(System.in);
                int id = sc.nextInt();
                    if (tracker.findById(id)) {
                        System.out.print("success." + System.lineSeparator());
                    } else {
                        System.out.print("item not found");
                    }

            } else if (select == 5) {
                System.out.println("=== Find Items by Name ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                for (Item item : items) {
                    System.out.print(item);
                }

            } else if (select == 6) {
                run = false;
            }

        }

    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

}


