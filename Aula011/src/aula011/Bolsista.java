/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

import java.text.DecimalFormat;

/**
 *
 * @author BrenoBaroni
 */
public class Bolsista extends Aluno {

    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando a bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Pagando a Mensalidade de " + this.getNome() + ". Com desconto de R$" + df.format(this.getBolsa()));
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
