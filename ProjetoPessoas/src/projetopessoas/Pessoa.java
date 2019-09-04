/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

import java.util.Scanner;

/**
 *
 * @author BrenoBaroni
 */
public class Pessoa {

    Scanner key = new Scanner(System.in);

    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    private int numero;

    //Metodos
    public void fazerAniv() {
        this.setIdade(this.getIdade() + 1);
    }

    //Metodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

}
