package ru.job4j.professions;

public class Doctor extends Profession {

   private String specialty;

    public Doctor(String name, String surname, String education, String brithday, int experience) {
        super(name, surname, education, brithday, experience);
        specialty = "Детский";
    }

    void treatPatient() {
    }
}
