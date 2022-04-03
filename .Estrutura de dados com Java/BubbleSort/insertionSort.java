/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *
 */
public class insertionSort {
   
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
       
        for(int indice1=0; indice1 < vetor.length; indice1++){
            vetor[indice1] = (int) (Math.random() * vetor.length);
        }
        int contador=0;
        System.out.print("Vetor Desordenado:");
        for(int i=0; i < vetor.length; i++){
            System.out.print(" "+vetor[i]); 
            
        }
        
        int aux, indice2;
        for(int indice1=1; indice1 < vetor.length; indice1++){ 
            aux = vetor[indice1]; 
            indice2 = indice1-1; 
            while(indice2 >= 0 && vetor[indice2] > aux){ 
                vetor[indice2+1] = vetor[indice2]; 
                indice2--;
                 contador++; 
            }
            vetor[indice2+1] = aux; 
              
        }
                
        System.out.print("\nVetor Ordenado:");
        for(int ind=0; ind < vetor.length; ind++){
            System.out.print(" "+vetor[ind]);
           
        }
         System.out.println("\nNumero de Trocas: "+contador);
    }
}