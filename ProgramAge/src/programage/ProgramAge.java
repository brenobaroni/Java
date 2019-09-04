/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programage;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class ProgramAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int aoy = 2018;
        System.out.println("Entry your year of birthday:");
        int birthday = keyboard.nextInt();
        int age = (aoy-birthday);
        System.out.println("Your age is: " +age);
        
        if (aoy-birthday>=18 ) {
            System.out.println("Major of Age");
        } else {
            System.out.println("Minor of Age");
        }
        
    }
    
}
