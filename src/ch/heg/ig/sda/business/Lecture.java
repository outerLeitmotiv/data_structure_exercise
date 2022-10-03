package ch.heg.ig.sda.business;


import ch.heg.ig.sda.datastructure.ArrayList;



/**
 * @author Olivier
 *
 * Lecutre class, a lecutre is composed of multiple students
 */

public class Lecture {
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Lecture(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() { // a lecture is composed of students, this return the students of the lecture
        return students;
    }

    public Student getStudentName (String name) { // return a student using his name, easier to use than having to always use the variable
        int check = -1; // initiate variable
        for (int i= 0; i<getStudents().size(); i++) { // navigate through the array of student of the lecture
            if (getStudents().get(i).getName().equals(name)) { // compare the name found at the index with the name given in parameter
                check = i; // passes the value of the index to the check variable
            }
        }
        if (check != -1) { // if check has not its initial value, then
            return getStudents().get(check); // return the name of the student
        } else {
            return null; // otherwise return nothing
        }
    }

    public void printList() { // print the list of the student attending the lecture
        for (int i = 0; i<getStudents().size(); i++) {
            System.out.println(getStudents().get(i));
        }
    }

    public void addStudent (Student student) {
        this.getStudents().add(student);
    }

    public void removeStudent (int i){
        this.getStudents().remove(i);
    }
}