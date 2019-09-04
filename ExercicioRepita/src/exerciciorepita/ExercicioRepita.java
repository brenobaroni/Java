/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author breno
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int p = 0;
        int i = 0;
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um numero: <br><em>(valor 0 para sair)</br><em></html>"));
        if (n % 2 == 0){
            p = p+1;
        } else {
            i = i+1;
        }
        } while (n !=0);
        JOptionPane.showMessageDialog(null,"<html><br>Voce digitou:"+ p);
        JOptionPane.showMessageDialog(null,"<html><br>Voce digitou: "+ i);
  
    }
        
    
}
