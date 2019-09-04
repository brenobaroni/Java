/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamadinha;

/**
 *
 * @author BrenoBaroni
 */
public class Hamadinha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Fernanda", 22, "Feminino");
        p[1] = new Pessoa("Breno", 26, "Masculino");

        l[0] = new Livro("Como amar o momo", "Hebert Richard", 200, p[0]);
        l[1] = new Livro("Lidando como o amor racheta", "Tomo Noku", 220, p[1]);
        l[2] = new Livro("Trabson", "Yoda", 350, p[1]);

        l[2].abrir();
        l[2].folhear(4);
        System.out.println(l[2].detalhes());
    }

}
