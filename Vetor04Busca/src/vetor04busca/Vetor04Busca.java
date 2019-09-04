/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04busca;

import java.util.Arrays;

/**
 *
 * @author breno
 */
public class Vetor04Busca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 7, 6, 1, 9, 10, 15, 14, 18};
        for (int v:vet){
            System.out.print(" " +  v);
        }
        System.out.println(" ");
        int p = Arrays.binarySearch(vet, 9);
        System.out.println(" Encontrei o Vetor na Posição: " + p);
        
    }
    
}
