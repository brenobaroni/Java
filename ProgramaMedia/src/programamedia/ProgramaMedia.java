/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        float n1 = keyboard.nextFloat();
        float n2 = keyboard.nextFloat();
        float media = (n1+n2)/2;
        System.out.println("Your score is: " +media);
        if (media>9){
            System.out.println("Congratulations to your score !");
        }
        
    }
    
}
