/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula013;

/**
 *
 * @author fefej
 */
public class Aula013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();

        //l.emitirSom();
        //c.reagir("Olá");
        //c.reagir("Oi totó");
        c.reagir(11, 45);
        c.reagir(true);
    }

}
