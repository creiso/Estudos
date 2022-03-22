/*
 * Codigo pra gerar numero random
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author creiso
 */
import java.util.Random;


public class Exercicio2 {

      public static void main(String[] args) {
                   
        int[] vetor = new int[50];
        char aux;
        char lista[] = {'a','b','c','d','a','d','a','i', 'j','t','a', 'v', 'i', 'o', 'u', 'q','a','q','u','e','t','o','t','p','a','b','d','s','l','g','y','e','t','i','t','n','z','l','s','u','y','r','l','a','h','t','o','y','o'};
       
        
        
                for (int ind =0; vetor.length> ind; ind++){
                    for(int ind2=0; lista.length-1>ind2; ++ind2){
                        if(lista[ind2]< lista[ind2+1]){
                                aux=lista[ind2];
                                lista[ind2] = lista[ind2+1];
                                lista[ind2+1]= aux;
                                

                        }
                       
                    }

                }

                for (int ind =0 ; ind < lista.length; ++ind){
                    
                    System.out.print(" "+lista[ind]+".");
                }
                   
    }
}