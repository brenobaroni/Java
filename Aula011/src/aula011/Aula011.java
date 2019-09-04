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
public class Aula011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
        // Aluno Bolsista
        Aluno a1 = new Aluno();
        a1.setNome("Cleiton Rasta");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("Indefinito");
        a1.pagarMensalidade();

        // Aluno Bolsista
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jamirongo");
        b1.setIdade(17);
        b1.setBolsa(500.00f);
        b1.setSexo("M");
        b1.renovarBolsa();
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Terosdingo");
        t1.setIdade(29);
        t1.setRegProf(2111);
        t1.setCurso("Programação C#");
        t1.setSexo("M");
        t1.patricar();
    }

}
