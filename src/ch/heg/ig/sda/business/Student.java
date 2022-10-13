package ch.heg.ig.sda.business;

/**
 * @author Olivier
 */

public class Student extends Person {
    private double grade;

    public Student (String firstName, String lastName) {
        super(firstName, lastName);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void updateGrade (double modifier) {
        this.grade+=modifier;
    }
}