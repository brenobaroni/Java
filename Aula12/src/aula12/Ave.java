/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author BrenoBaroni
 */
public class Ave extends Animal {

    //Atributos
    private String corDaPena;
    private boolean ninho;

    //Metodos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave piu piu");
    }

    public void fazerNinho() {
        System.out.println("Fez o Ninho!");
        this.setNinho(true);
    }

    public void statusNinho() {
        if (this.isNinho()) {
            System.out.println("A Ave tem um ninho.");
        } else {
            System.out.println("A Ave não tem um ninho.");
        }

    }

    //Metodos Especiais
    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

    public boolean isNinho() {
        return ninho;
    }

    public void setNinho(boolean ninho) {
        this.ninho = ninho;
    }

}
