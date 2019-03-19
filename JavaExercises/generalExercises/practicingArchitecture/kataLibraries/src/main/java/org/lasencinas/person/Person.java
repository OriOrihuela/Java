package org.lasencinas.person;

public class Person {

    /* ---- Properties of the class ---- */
    private String name = null;
    private String surname = null;
    private String dni = null;
    private String birth = null;
    private boolean wantsToBeEmployee = false;


    /* ---- Constructor ---- */
    public Person(String name, String surname, String dni) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }


    /* ---- Getters ---- */
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDni() {
        return dni;
    }

    public String getBirth() {
        return birth;
    }

    public boolean wantsToBeEmployee() {
        return wantsToBeEmployee;
    }

    /* ---- Setters ---- */
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setWantsToBeEmployee(boolean wantsToBeEmployee) {
        this.wantsToBeEmployee = wantsToBeEmployee;
    }

    /* ---- Behaviours ---- */
    public void validateDNI(String dni) {
        if (dni.equals(getDni())) {
            System.out.println("The DNI introduced corresponds to " + getName() + " " + getSurname() + ".");
        } else {
            System.out.println("Incorrect DNI, please try again.");
        }
    }

    @Override
    public String toString() {
        return "name: '" + getName()+ '\'' +
                ", surname: '" + getSurname() + '\'' +
                ", dni: '" + getDni() + '\'';
    }
}
