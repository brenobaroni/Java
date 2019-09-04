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
public class Tecnico extends Aluno {

    //Atributos
    private int regProf;

    //Metodos
    public void patricar() {
        System.out.println("Praticando: " + this.getCurso());
    }

    //Metodos Especiais
    public int getRegProf() {
        return regProf;
    }

    public void setRegProf(int regProf) {
        this.regProf = regProf;
    }

}
