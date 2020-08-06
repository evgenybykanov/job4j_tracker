package ru.job4j.profession;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private int birthday;

    public int getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
}
