/*
 * Codigo pra gerar numero random
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author creiso
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here              
        int[] vetor = new int[5000];
        int i= 0;
        int aux;
        
        boolean controle;
        while(vetor.length>i){
                vetor[i] =  1 + (int) (Math.random() * 10000);
                System.out.print(vetor[i]+",");
                i++;
        }
        
                for (int ind =0; vetor.length> ind; ind++){
                    for(int ind2=0; vetor.length-1>ind2; ++ind2){
                        if(vetor[ind2]< vetor[ind2+1]){
                                aux=vetor[ind2];
                                vetor[ind2] = vetor[ind2+1];
                                vetor[ind2+1]= aux;
                                

                        }
                       
                    }

                }

                for (int ind =0 ; ind < vetor.length; ++ind){
                    
                    System.out.print(" "+vetor[ind]+".");
                }
                   
    }
}