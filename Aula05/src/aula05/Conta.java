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
public class Conta {

    public int numConta;
    private String tipoConta;
    private String donoConta;
    private double saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }

    public void status() { // continuar daqui.
        System.out.println("");
    }

    public void setNumConta(int snc) {
        this.numConta = snc;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipoConta(String t) {
        this.tipoConta = t;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setDonoConta(String d) {
        this.donoConta = d;
    }

    public String getDonoConta() {
        return this.donoConta;
    }

    public void setSaldoConta(Double s) {
        this.saldo = s;
    }

    public double getSaldoConta() {
        return this.saldo;
    }

    public void setStatusConta(boolean sc) {
        this.status = sc;
    }

    public boolean getStatusConta() {
        return this.status;
    }

    public void abrirConta() {
        this.setTipoConta("CC");
        this.setStatusConta(true);

        if (this.tipoConta == "CC") {
            this.saldo += 50;
        } else if (this.tipoConta == "CP") {
            this.saldo = 150;
        } else {
            this.saldo = 0;
        }

    }

    public void fecharConta() {

        if (this.saldo > 0) {
            System.out.println("Sua conta ainda tem dinheiro. Não pode ser Fechada");
        } else if (this.saldo < 0) {
            System.out.println("Sua conta está no negativo e não pode ser fechada.");
        } else {
            this.setStatusConta(false);
            System.out.println("Conta Fechada com sucesso!");
        }
    }

    public void depositar(double v) {
        if (this.status == true) {
            this.setSaldoConta(this.getSaldoConta() + v);
        } else {
            System.out.println("Está conta não está ativa.");
        }
    }

    public void sacar(double v) {
        if (this.getStatusConta()) {
            this.setSaldoConta(this.getSaldoConta() - v);
        } else {
            System.out.println("Conta Inativa.");
        }

    }

    public void pagarMensal() {
        if (this.tipoConta == "CC") {
            this.setSaldoConta(this.getSaldoConta() - 20);
        } else {
            this.setSaldoConta(this.getSaldoConta() - 5);
        }

    }

}
