/*
 * Codigo pra gerar numero random
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aularenan;
/**
 *
 * @author creiso
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here              
        int[] vetor = new int[5];
        int i= 0;
        while(vetor.length>i){
                vetor[i] =  1 + (int) (Math.random() * 100);
                System.out.print(vetor[i]+" ");
                i++;
        }
        QuickSort  qui = new QuickSort();
        qui.quickSort(vetor, i, i);
       
    }
    
     public int particiona(int vetor[], int inicio, int fim){
         int esq, dir, pivo, aux;
         
         esq = inicio;
         dir = fim;
         pivo = vetor[inicio];
         while (esq < dir){
             while (vetor[esq] <= pivo)
                 esq++;
             while (vetor[dir] > pivo)
                 dir--;
             if (esq < dir){
                 aux = vetor[esq];
                 vetor[esq] = vetor[dir];
                 vetor[dir] = aux;
                 
             }
         
         }
               
            vetor[inicio] =vetor [dir];
            vetor[dir] = pivo;
            
            return dir;
            
     }
     
     
     public void quickSort(int vetor[], int inicio, int fim){
         int pivo;
         
         if(fim>inicio){
             pivo= particiona(vetor,inicio,fim);
             quickSort(vetor, 0, vetor.length -1);
             quickSort(vetor, vetor.length +1, fim);
       
         }
            System.out.println("\n Ordenado: ");
            for (int i =0; vetor.length >i;i++)
            System.out.print(""+vetor[i]+" ");
        
     }
     
}
