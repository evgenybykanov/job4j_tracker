package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item("id4567");
        tracker.add(new Item("java"));
        tracker.add(item);
        System.out.println(tracker.findById(2));
        Item[] rsl = tracker.findByName("id4567");
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
        System.out.println(Arrays.toString(tracker.findAll()));
    }

    }


