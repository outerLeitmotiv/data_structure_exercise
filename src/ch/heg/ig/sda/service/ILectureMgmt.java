package ch.heg.ig.sda.service;

import ch.heg.ig.sda.business.Lecture;
import ch.heg.ig.sda.business.Student;
import ch.heg.ig.sda.datastructure.ArrayList;


/**
 * @author Olivier
 */
public interface ILectureMgmt {

    /**
     * Receive a lecture and 2 students. Print the name of the students and their grades.
     * Compare their grades and print the name of the student with the highest grade and the difference
     * between both grades.
     * If it is a tie, print
     * @param lecture the lecture the students are in
     * @param name1 first name of the first student
     * @param name2 first name of the second student
     */
    void compareGrade (Lecture lecture, String name1, String name2);

    /**
     * Receives students and print the name of all the student who got a grade > 5.5
     * @param studentArray list of students, like lectureName.getStudents()
     */
    void mention (ArrayList<Student> studentArray);

    /**
     * Receives students. If the student has a grade > 4, print a message saying the student passed the year.
     *                    If the student has a grade < 4, print a message saying the student failed the year.
     * @param studentsArray list of students, like lectureName.getStudents()
     */
    void passOrFail (ArrayList<Student> studentsArray);
}
