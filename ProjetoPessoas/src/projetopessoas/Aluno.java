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
public class Aluno extends Pessoa {

    //Atributos
    private int mat;
    private String curso;

    //Métodos
    public void cancelarMatr() {
        System.out.println("Matricula será cancelada.");
        this.setMat(0);
    }

    //Métodos Especiais
    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
