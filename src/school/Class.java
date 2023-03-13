package school;
import java.util.List;
import java.util.Date;

public class Class {
    private Date dateCall;
    private List<Student> students;

    public Class(Date dateCall, List<Student> students){
        this.dateCall = dateCall;
        this.students = students;
    }

    public Date getDateCall(){
        return dateCall;
    }

    public void setDateCall(Date dateCall) {
        this.dateCall = dateCall;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student){
        students.add(student);
    }
}
