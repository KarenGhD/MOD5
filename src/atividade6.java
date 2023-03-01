import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class atividade6 {
    public static void main (String[] args){
       int[] numeros = new int[3];
       numeros[0]=100;
       numeros[1]=200;
       numeros[2]=300;

        System.out.println("valores iniciais:");

       for( int i=0; i< numeros.length;i++){
           System.out.println(numeros[i]);
      }
        System.out.println("Valores invertidos:");

       int [] numerosReverso = new int[numeros.length];
       int posicaoMaxima =numeros.length -1;

       for( int i=posicaoMaxima;i>=0;i--){
           numerosReverso[posicaoMaxima-i]=numeros[i];
       }
       for (int i=0; i< numerosReverso.length;i++){
           System.out.println(numerosReverso[i]);

       }

        char[] letras = new char[5];
        letras[0]='k';
        letras[1]='a';
        letras[2]='r';
        letras[3]='e';
        letras[4]='n';

        System.out.print("nome formado:");

        for( int a=0; a<letras.length ;a++){
            System.out.print(letras[a]);
        }
        char[] nomeInvertido = new char[letras.length];
        int posicaoMax= letras.length -1;

        for( int a=posicaoMax; a>=0;a--) {
            nomeInvertido[posicaoMax - a] = letras[a];
        }
        System.out.println("");
        System.out.print("Nome invertido:");
        for(int a=0;a<nomeInvertido.length;a++){
            System.out.print(nomeInvertido[a]);
        }

        }



   }

