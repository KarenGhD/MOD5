package school;

import java.util.Date;

public class Student {
    private String name;

    public Student(String name, int matricula, Date dateCall){

        this.name =name;
        this.matricula = matricula;
        this.dateCall= dateCall;
    }

    public void setName(String name){

        this.name =name;
    }


}
