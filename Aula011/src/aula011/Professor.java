/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author BrenoBaroni
 */
public class Professor extends Pessoa {

    //Atributos
    private int salario;

    //Metodos
    public void receberAumento(int aum) {
        this.setSalario(this.getSalario() + aum);
    }

    //Metodos Especiais
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
