package ru.job4j.ex;

public class FindEl  extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"1", "b", "3", "d", "5"};
        try {
            indexOf(value, "c");
        } catch (ElementNotFoundException g) {
            g.printStackTrace();
        }
    }
}
