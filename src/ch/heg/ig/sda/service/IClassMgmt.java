package ch.heg.ig.sda.service;

import ch.heg.ig.sda.business.Lecture;
import ch.heg.ig.sda.business.Student;
import ch.heg.ig.sda.datastructure.ArrayList;


/**
 * @author Olivier
 */
public interface IClassMgmt {

    public double compareGrade (Lecture lecture, String name1, String name2); // compare the grade of 2 students of the same lecture
    public void mention (ArrayList<Student> studentArray); // check all the students of a lecture and print all of those who got a mention
    public void passOrFail (ArrayList<Student> studentsArray); // check all the student of a lecture and print if they passed or failed the lecutre
}
