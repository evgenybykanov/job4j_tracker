package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("book#1", 734);
        Book cleancode = new Book("Clean code", 000);
        Book book2 = new Book("book#2", 653);
        Book book4 = new Book("book#4", 234);
        Book[] plase = new Book[4];
        plase[0] = book;
        plase[1] = cleancode;
        plase[2] = book2;
        plase[3] = book4;

        for (int index = 0; index < plase.length; index++) {
            Book pl = plase[index];
            System.out.println(pl.getName() + " - " + pl.getPage());
        }
        System.out.println("Replace book #1 to book #4");
        plase[0] = book4;
        plase[3] = book;
        for (int index = 0; index < plase.length; index++) {
            Book pl = plase[index];
            System.out.println(pl.getName() + " - " + pl.getPage());
        }
        System.out.println("Shown only book with the name \"Clean code\" ");
        for (int index = 0; index < plase.length; index++) {
            Book pl = plase[index];
            if (pl.getName().equals("Clean code")) {
                System.out.println(pl.getName());
            }

        }
    }
}
