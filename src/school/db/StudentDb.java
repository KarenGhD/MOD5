package school.db;
import school.Student;


import java.util.ArrayList;
import java.util.List;

public class StudentDb {
    private List<Student> StudentList = new ArrayList<>();

    public List<Student> getStudentList(){

        return studentList;
    }
    public void addNewStudent(Student student){

        studentList.add(student);
    }
}


