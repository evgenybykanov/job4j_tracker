package ru.job4j.tracker;


import java.util.Arrays;


 public class StartUI {

     public static void addItem(Input input, Tracker tracker) {
         System.out.println("=== add a new Item ====");
         String name = input.askStr("Enter name: ");
         Item item = new Item(name);
         tracker.add(item);
     }

     public static void findAll(Tracker tracker) {
         System.out.println("=== Show all Items ====");
         Item item = new Item();
         if (tracker.findAll() != null) {
                 System.out.print("ID: " + item.getId() + "; ");
                 System.out.println("Name: " + item.getName());
         }
     }

     public static void editItem(Input input, Tracker tracker) {
         System.out.println("=== replase an Item ===");
         int id = input.askInt("Enter ID: ");
         String name = input.askStr("Enter name: ");
         Item item = new Item(name);
         if (tracker.replace(id, item)) {
             System.out.println("Item change");
         } else {
             System.out.println("Item on id " + id + "not found");
         }
     }

     public static void deleteItem(Input input, Tracker tracker) {
         System.out.println("=== input Item ===");
         int id = input.askInt("Enter ID: ");
         if (tracker.delete(id)) {
             System.out.println("Item delete");
         } else {
             System.out.println("Item on id " + id + "not found");
         }
     }

     public static void finditembyId(Input input, Tracker tracker) {
         System.out.println("=== find an Item ===");
         int id = input.askInt("Enter ID: ");0
         Item itemById = tracker.findById(id);
         if (itemById != null) {
             System.out.print("ID: " + itemById.getId() + "; ");
             System.out.println("Name: " + itemById.getName());
         } else {
             System.out.println("Item  id " + id + "not found");
         }
     }


     public static void findByName(Input input, Tracker tracker) {
         System.out.println("=== Find Item by name ===");
         String name = input.askStr("Enter name: ");
         Item[] itemsname = tracker.findByName(name);
         if (itemsname[0] != null) {
             for (Item item : itemsname) {
                 System.out.print("ID: " + item.getId() + "; ");
                 System.out.println("Name: " + item.getName());
             }
         }
     }

     public void init(Input input, Tracker tracker) {
         boolean run = true;
         while (run) {
             this.showMenu();
             int select = Integer.valueOf(input.askStr(" "));
             if (select == 0) {
                 StartUI.addItem(input, tracker);
             } else if (select == 1) {
                 StartUI.findAll(tracker);
             } else if (select == 2) {
                 StartUI.editItem(input, tracker);
             } else if (select == 3) {
                 StartUI.deleteItem(input, tracker);
             } else if (select == 4) {
                 StartUI.finditembyId(input, tracker);
             } else if (select == 5) {
                 StartUI.findByName(input, tracker);
             } else if (select == 6) {
                 run = false;
             }
         }
     }

     public void showMenu() {
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
         Input input = new ConsoleInput();
         Tracker tracker = new Tracker();
         new StartUI().init(input, tracker);
     }
 }




