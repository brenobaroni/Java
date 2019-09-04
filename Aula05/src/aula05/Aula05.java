/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author breno
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubilei Mamado");
        p1.abrirConta("CC");
        p1.depositar(300);

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1112);
        p2.setDono("Creuza Marinda");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);

        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }

}
