/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author breno
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.25, 3.45, 0.02, 2.78, 3.33, 5.80};
        Arrays.sort(v);
        for( double valor: v){
            System.out.println(valor);
        }
    }
    
}
