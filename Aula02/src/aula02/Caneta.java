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
public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está Tampada ? " + this.tampada);
    }

    void rabiscar() {
        if (tampada == true) {
            System.out.println("ERRO!: A Caneta está tampada.");
        } else {
            System.out.println("Estou rabiscando.");
        }

    }

    void tampar() {
        this.tampada = true;
        //System.out.println("A Canete foi tampada.");

    }

    void destampar() {
        this.tampada = false;
        //System.out.println("A Caneta foi destampada.");

    }

}
