package ru.job4j.profession;

public class Doctor extends Profession {
    private int experience;
    private String diagnosisheal;

    public int getExperience() {
        return this.experience;
    }

    public String diagnosisheal(String pacient) {
        return this.diagnosisheal;
    }
}
