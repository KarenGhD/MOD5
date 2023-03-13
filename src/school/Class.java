package school;
import java.util.List;

public class Class {
    private String day;
    private List<Student> students;

    public Class(String day, List<Student> students){
        this.day = day;
        this.students = students;
    }

    public String getDay(){
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student){
        students.add(student);
    }
}
