import java.util.Scanner;
import models.Produto;

public class main {
    public static void main (String[] args) throws Exception{
        System.out.println("-------PEDIDO DE VENDAS----");
        int option;
        do{
            System.out.println("1- Solicitar produto");
            System.out.println("0- sair");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual operação deseja realizar?");
            option = scanner.nextInt();

            process(option);
        }while(option!=0);
    }
    public static void process(int option){

        switch(option){
            case 1:{
                Scanner scanner = new Scanner(System.in);

                System.out.println("qual a descrição deseja dar ao produto?");
                String descricao = scanner.nextLine();

                System.out.println("qual o id deseja dar ao novo produto?");
                int id =scanner.nextInt();

                Produto novoProduto = new Produto(id,descricao);

                System.out.println("Produto criado com sucesso");
                System.out.println("---ID "+novoProduto.getId());
                System.out.println("---Descricao: " +novoProduto.getDescricao);

            }
        }
    }
}
