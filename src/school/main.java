package school;

import models.Produto;
import school.db.StudentDb;

import java.text.SimpleDateFormat;
import java.util.*;

public class main {
   static StudentDb studentsDb = new StudentDb();

   public static void main (String[] args) throws Exception {
      System.out.println("-------Lista de Presença----");
      int option;
      do {
         System.out.println("1- Chamar aluno");
         System.out.println("2- Listar alunos e datas");
         System.out.println("0- sair");
         Scanner scanner = new Scanner(System.in);
         System.out.println("O que deseja realizar?");
         option = scanner.nextInt();

         working(option);
      } while (option != 0);
   }

      public static void working(int option) throws Exception{

         switch(option){
            case 1: {
               Scanner scanner = new Scanner(System.in);

               System.out.println("Qual o nome do aluno?");
               String name = scanner.nextLine();

               System.out.println("Qual matricula?");
               int matricula = scanner.nextInt();

               System.out.println("Qual a data da chamada:");
               String dataString = scanner.next();

               Date dateCall = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

               Student newStudent = new Student( name, matricula, dateCall);
               studentsDb.addNewStudent(newStudent);
               break;
            }
            case 2:{
               List<Student> StudentList = studentsDb.getStudentList();

               for(Student student :   StudentList){

                  System.out.println("---Nome "+ name.getName());
                  System.out.println("---Matricula: " +matricula.getMatricula());
                  System.out.println("---Data da chamada: " +dateCall.getDateCall());
                  System.out.println("---------------------------------------");
               }
               break;
            }
            default:
               throw new IllegalStateException("Unexpected value: " + option);
         }
      }
   }




//      <String> Student = new ArrayList<>();
//       Student João = new Student("João");
//       Student Pedro = new Student("Pedro");
//       Student Karen = new Student("Karen");
//       Student Maria = new Student("Maria");
//
//       List<Student> call1= List.of(João, Pedro, Karen, Maria);
//       List<Student> call2= List.of( Pedro, Karen, Maria);
//       List<Student> call3= List.of( Karen, Maria);
//
//       Class class1 = new Class("01", call1);
//       Class class2 = new Class("02", call2);
//       Class class3 = new Class("03", call3);
//
//       Map<String, Class> call = new HashMap<>();
//       call.put("01", class1);
//       call.put("02", class2);
//       call.put("03", class3);
//
//       System.out.println(call.keySet());
//       System.out.println(call1.get(2));
//       }






