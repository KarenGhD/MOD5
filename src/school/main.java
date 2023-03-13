package school;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] arg){
       Student João = new Student("João");
       Student Pedro = new Student("Pedro");
       Student Karen = new Student("Karen");
       Student Maria = new Student("Maria");

       List<Student> call1= List.of(João, Pedro, Karen, Maria);
       List<Student> call2= List.of( Pedro, Karen, Maria);
       List<Student> call3= List.of( Karen, Maria);

       Class class1 = new Class("01", call1);
       Class class2 = new Class("02", call2);
       Class class3 = new Class("03", call3);

       Map<String, Class> call = new HashMap<>();
       call.put("01", class1);
       call.put("02", class2);
       call.put("03", class3);



    }

}
