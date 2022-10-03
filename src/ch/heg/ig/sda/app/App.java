package ch.heg.ig.sda.app;

import ch.heg.ig.sda.business.Student;
import ch.heg.ig.sda.business.Lecture;
import ch.heg.ig.sda.service.ClassMgmt;


/**
 * @author Olivier
 *
 * launcher to test the service, busines and datastructure packages
 */


public class App {
    public static void main(java.lang.String[] args) {
       Lecture igpt = new Lecture("IGPT");
       igpt.addStudent(new Student("Guillaume"));
       igpt.addStudent(new Student("Isabelle"));
       igpt.addStudent(new Student("Olivier"));
       igpt.printList();
       try {
           igpt.removeStudent(2);
           igpt.printList();
           igpt.getStudentName("Guillaume").setSdaGrade(5.25);
           igpt.getStudentName("Isabelle").setSdaGrade(5.5);
           igpt.getStudentName("Olivier").setSdaGrade(3.25);
           igpt.printList();
       } catch (NullPointerException e) {
           System.out.println("NULL : "+e.getMessage());
       }
       igpt.getStudentName("Guillaume").updateGrade(0.25);
       igpt.printList();
       ClassMgmt classMgmt = new ClassMgmt();
       classMgmt.compareGrade(igpt, "Guillaume", "Isabelle");
       classMgmt.mention(igpt.getStudents());
       classMgmt.passOrFail(igpt.getStudents());
    }
}
