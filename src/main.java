import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public static void process(int option) throws Exception{

        switch(option){
            case 1:{
                Scanner scanner = new Scanner(System.in);

                System.out.println("qual a descrição deseja dar ao produto?");
                String descricao = scanner.nextLine();

                System.out.println("qual o id deseja dar ao novo produto?");
                int id =scanner.nextInt();

                System.out.println("Qual o preço: ");
                double preco = scanner.nextDouble();

                System.out.println("Qual a data de validade:");
                String dataString =scanner.next();

                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                Produto novoProduto = new Produto(id,descricao, preco, dataValidade);

                System.out.println("Produto criado com sucesso");
                System.out.println("---ID "+novoProduto.getId());
                System.out.println("---Descricao: " +novoProduto.getDescricao());
                System.out.println("---Preço: " +novoProduto.getPreco());
                System.out.println("---Data de Validade: " +novoProduto.getDataValidade());
                System.out.println("---------------------------------------");

            }
        }
    }
}
