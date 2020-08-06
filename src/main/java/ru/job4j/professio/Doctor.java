package ru.job4j.professio;

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
