package ch.heg.ig.sda.business;

/**
 * @author Olivier
 */

public class Student {
    private String name;
    private double grade;

    public Student (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getSdaGrade() {
        return grade;
    }

    public void setSdaGrade(double grade) {
        this.grade = grade;
    }

    public double updateGrade (double modifier) {
        return this.grade+=modifier;
    }

    @Override
    public String toString() {
        return name;
    }
}