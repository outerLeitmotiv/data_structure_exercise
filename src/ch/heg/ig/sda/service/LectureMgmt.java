package ch.heg.ig.sda.service;

import ch.heg.ig.sda.business.Lecture;
import ch.heg.ig.sda.business.Student;
import ch.heg.ig.sda.datastructure.ArrayList;


/**
 * @author Olivier
 */
public class LectureMgmt implements ILectureMgmt {



    @Override
    public void compareGrade(Lecture lecture, String name1, String name2) {
        System.out.print("\n"+lecture.getStudentName(name1).getFirstName()+ " ");
        System.out.println(lecture.getStudentName(name1).getGrade());
        System.out.print("\n"+lecture.getStudentName(name2).getFirstName()+" ");
        System.out.println(lecture.getStudentName(name2).getGrade());
        if (lecture.getStudentName(name1).getGrade()>lecture.getStudentName(name2).getGrade()) {
            System.out.println("\n"+lecture.getStudentName(name1).getFirstName()+" has a better grade by a difference of "+
                    (lecture.getStudentName(name1).getGrade() - lecture.getStudentName(name2).getGrade()));
        } else if (lecture.getStudentName(name2).getGrade()>lecture.getStudentName(name1).getGrade()){
            System.out.println("\n"+lecture.getStudentName(name2).getFirstName()+" has a better grade by a difference of "+
                    (lecture.getStudentName(name2).getGrade() - lecture.getStudentName(name2).getGrade()));
        } else {
            System.out.println("\nBoth students have the same grade.");
        }
    }

    @Override
    public void mention(ArrayList<Student> studentArray) {
        for (int i = 0; i<studentArray.size(); i++) {
            if (studentArray.get(i).getGrade()>=5.5) {
                System.out.println("\n"+studentArray.get(i).getFirstName()+", you did an awesome job and got mention !");
            }
        }
    }

    @Override
    public void passOrFail(ArrayList<Student> studentsArray) {
       for (int i = 0; i<studentsArray.size(); i++) { // loop through a lecture (an array of students)
            if (studentsArray.get(i).getGrade() >= 4) { // compare if grade is 4 or more
                System.out.println("\n"+"Congratulations " + studentsArray.get(i).getFirstName() + ", you passed the class !"); // if grade is 4 or more, print the name of the
            } else {                                                                                                  // name of the student and a success message
                System.out.println("\n"+"Sorry " + studentsArray.get(i).getFirstName() + ", you failed. Try again next year."); // if not, print the name and a failure message
            }
        }
    }
}
