package ch.heg.ig.sda.app;

import ch.heg.ig.sda.business.Student;
import ch.heg.ig.sda.business.Lecture;
import ch.heg.ig.sda.service.LectureMgmt;


/**
 * @author Olivier
 *
 * launcher to test the service, busines and datastructure packages
 *
 * GitHub repo : https://github.com/outerLeitmotiv/Cas_pratique_part2.git
 */


public class App {
    public static void main(java.lang.String[] args) {
       Lecture igpt = new Lecture("IGPT");
       igpt.addStudent(new Student("Guillaume", "Champion"));
       igpt.addStudent(new Student("Isabelle", "Stransky-Heilkron"));
       igpt.addStudent(new Student("Olivier", "Mouttet"));
       igpt.printList();
       try { // test to verify if removeStudent is out of reach or not
           igpt.removeStudent(2);
           igpt.printList();
           igpt.getStudentName("Guillaume").setGrade(5.25);
           igpt.getStudentName("Isabelle").setGrade(5.5);
           igpt.getStudentName("Olivier").setGrade(3.25);
           igpt.printList();
       } catch (NullPointerException e) {
           System.out.println("NULL : "+e.getMessage());
       }
       igpt.getStudentName("Guillaume").updateGrade(0.25);
       igpt.printList();
       LectureMgmt lectureMgmt = new LectureMgmt();
       lectureMgmt.compareGrade(igpt, "Guillaume", "Isabelle");
       lectureMgmt.mention(igpt.getStudents());
       lectureMgmt.passOrFail(igpt.getStudents());
    }
}
