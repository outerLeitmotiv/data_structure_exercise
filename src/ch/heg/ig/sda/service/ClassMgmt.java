package ch.heg.ig.sda.service;

import ch.heg.ig.sda.business.Lecture;
import ch.heg.ig.sda.business.Student;
import ch.heg.ig.sda.datastructure.ArrayList;


/**
 * @author Olivier
 */
public class ClassMgmt implements IClassMgmt {

    @Override
    public double compareGrade(Lecture lecture, String name1, String name2) {
        return lecture.getStudentName(name1).getSdaGrade() - lecture.getStudentName(name2).getSdaGrade();
    }

    @Override
    public void mention(ArrayList<Student> studentArray) {
        for (int i = 0; i<studentArray.size(); i++) {
            if (studentArray.get(i).getSdaGrade()>=5.5) {
                System.out.println(studentArray.get(i).getName()+", you did an awesome job and got mention !");
            }
        }
    }

    @Override
    public void passOrFail(ArrayList<Student> studentsArray) {
       for (int i = 0; i<studentsArray.size(); i++) { // loop through a lecture (an array of students)
            if (studentsArray.get(i).getSdaGrade() >= 4) { // compare if grade is 4 or more
                System.out.println("Congratulations " + studentsArray.get(i).getName() + ", you passed the class !"); // if grade is 4 or more, print the name of the
            } else {                                                                                                  // name of the student and a success message
                System.out.println("Sorry " + studentsArray.get(i).getName() + ", you failed. Try again next year."); // if not, print the name and a failure message
            }
        }
    }
}
