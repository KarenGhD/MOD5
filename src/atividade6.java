import java.util.ArrayList;
import java.util.List;

public class atividade6 {
    public static void main (String[] args){
        List<String> colecao = new ArrayList<>();
        colecao.add("Barco");
        colecao.add("Navio");
        colecao.add("Lancha");

        for( int  i=0; i<colecao.size() ;i++){
            System.out.println(colecao.get(i));
        }

        colecao.remove(1);

        for( int  i=0; i<colecao.size() ;i++){
            System.out.println(colecao.get(i));
        }




    }
}
