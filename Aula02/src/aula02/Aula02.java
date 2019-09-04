/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author breno
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo = "Caneta Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic Crystal";
        c2.cor = "Azul";
        c2.ponta = 0.3f;
        c2.destampar();
        c2.status();
        c2.rabiscar();

        Mouse m1 = new Mouse();
        m1.marca = "Logitech";
        m1.modelo = "G600";
        m1.tipo = "Óptico";
        m1.dpi = 8000;
        m1.botoes = 22;
        m1.status();
        m1.desligar();
        m1.mover();

    }

}
