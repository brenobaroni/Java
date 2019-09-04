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
public class Mouse {

    String marca;
    String modelo;
    String tipo;
    int dpi;
    int botoes;
    boolean ligado;

    void status() {
        System.out.println("Marga = " + this.marca);
        System.out.println("Modelo = " + this.modelo);
        System.out.println("Tipo de Sensor = " + this.tipo);
        System.out.println("DPI = " + this.dpi);
        System.out.println("Quantidade de Botões = " + this.botoes);
    }

    void ligar() {
        this.ligado = true;
        System.out.println("O mouse foi ligado.");
    }

    void desligar() {
        this.ligado = false;
        System.out.println("O mouse foi desligado.");
    }

    void mover() {
        if (ligado == true) {
            System.out.println("O mouse está funcionando.");
        } else {
            System.out.println(" O mouse não está funcionando ou está desligado.");
        }
    }

}
