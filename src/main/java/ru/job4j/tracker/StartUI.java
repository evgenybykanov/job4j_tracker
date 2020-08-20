package ru.job4j.tracker;



 @SuppressWarnings("checkstyle:EmptyLineSeparator")
 public class StartUI {
     public static void findAll (Tracker tracker){
         System.out.println("=== Show all Items ====");
         tracker.findAll();

     }
     public static void createItem(Input input, Tracker tracker) {
         System.out.println("=== Create a new Item ====");
         String name = input.askStr("Enter name: ");
         Item item = new Item(name);
         tracker.add(item);
     }

     public static void replaceItem(Input input, Tracker tracker) {
         System.out.println("=== Edit an Item ===");
         int id = Integer.parseInt(input.askStr("Enter ID: "));
         String name = input.askStr("Enter name: ");
         Item item = new Item(name);
         if (tracker.replace(id, item)) {
             System.out.println("Item change");
         } else {
             System.out.println("Item on id " + id + "not found");
         }
     }

     public static void deleteItem(Input input, Tracker tracker) {
         System.out.println("=== Delete Item ===");
         int id = Integer.parseInt(input.askStr("Enter ID: "));
         if (tracker.delete(id)) {
             System.out.println("Item delete");
         } else {
             System.out.println("Item on id " + id + "not found");
         }
     }

     public static void FinditembyId(Input input, Tracker tracker) {
         System.out.println("=== Edit an Item ===");
         int id = Integer.parseInt(input.askStr("Enter ID: "));
         if (tracker.findById(id)) {
             System.out.println("Item found");
         } else {
             System.out.println("Item on id " + id + "not found");
         }
     }


     public static void findByName(Input input, Tracker tracker) {
         System.out.println("=== Find Item by name ===");
         String name = input.askStr("Enter name: ");
         if (tracker.findByName(name)) {
             System.out.println("Item found");
         } else {
             System.out.println("Item on id " + name + "not found");
         }
     }

     public void init(Input input, Tracker tracker) {
         boolean run = true;
         while (run) {
             this.showMenu();
             int select = Integer.valueOf(input.askStr(" "));
             if (select == 0) {
                 StartUI.createItem(input, tracker);
             } else if (select == 1) {
                StartUI.findAll(Tracker tracer);
             } else if (select == 2) {
                 StartUI.replaceItem(id, item);
             } else if (select == 3) {
                 StartUI.deleteItem(id);
             } else if (select == 4) {
                 StartUI.FinditembyId(id);
             } else if (select == 5) {
                     StartUI.findByName(name);
             } else if (select == 6) {
                         run = false;
                     }

                 private void showMenu () {
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

                 public static void main (String[]args){
                     Input input = new ConsoleInput();
                     Tracker tracker = new Tracker();
                     new StartUI().init(input, tracker);
                 }


             }
         }
     }
 }