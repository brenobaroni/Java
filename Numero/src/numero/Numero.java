/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, t=0;
        String resp;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Digite um numero:");
            n = keyboard.nextInt();
            t = t+n; // ou t +=n;
            System.out.println("Quer continuar ? (S/N)");
            resp = keyboard.next();
        }while (resp.equals("S") || resp.equals("s"));
            System.out.println("A soma é igual a:" +t);
        
    }
    
}
