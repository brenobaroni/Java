/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author BrenoBaroni
 */
public class Funcionario extends Pessoa {

    //Atributos
    private String setor;
    private boolean trabalhando;

    //Metodos
    public void mudarTrab() {
        this.trabalhando = !this.trabalhando;
    }

    //Metodos Especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
