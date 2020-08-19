package ru.job4j.tracker;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;


public class StartUI {

    @SuppressWarnings("checkstyle:RightCurly")
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
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
                    item.print();
                }
            } else if (select == 2) {
                System.out.println("=== Edit an Item ===");
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.replace(id, item);
                if (tracker.replace(id, Item)) {
                    System.out.print("success." + System.lineSeparator());
                } else {
                    System.out.print("error." + System.lineSeparator());

                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.print("success." + System.lineSeparator());
                } else {
                    System.out.print(" error." + System.lineSeparator());
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by ID ===");
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                if (tracker.findById(id)) {
                    if (tracker.delete(id)) {
                        System.out.print("success." + System.lineSeparator());
                    } else {
                        System.out.print(" error." + System.lineSeparator());
                    }
                }
            }

            else if (select == 5) {
                System.out.println("=== Find Items by Name ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                tracker.findByName(name);
                print(items);

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


