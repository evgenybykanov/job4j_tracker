package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Женя");
        student.setSurname("Быканов");
        student.setGroup("job4j");
        student.setDate("06.08.2020");

        System.out.println(student.getName() + " " + student.getSurname() + " "
                +   student.getGroup() + " " + student.getDate());
    }
}