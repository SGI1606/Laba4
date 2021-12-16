package com.company;

/**
 * Class Human
 */
public class Human {
    /** id */
    private final int id;
    /** name */
    private final String Name;
    /** gender */
    private final String gender;
    /** birthday */
    private final String bDay;
    /** division */
    private final Division division;
    /** salary */
    private final double salary;

    public Human(int id, String name, String gender,String bDay, String divisionName, double salary) {
        this.id = id;
        Name = name;
        this.gender = gender;
        this.bDay=bDay;
        this.division = new Division(divisionName);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", gender='" + gender + '\'' +
                ", division=" + division +
                ", salary=" + salary +
                '}';
    }
}
