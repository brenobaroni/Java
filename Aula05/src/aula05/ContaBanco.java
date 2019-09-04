/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author BrenoBaroni
 */
public class ContaBanco {

    // Atributos.
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Metodos Personalizados.
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo de Conta: " + this.getTipo());
        System.out.println("Titular da conta: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("---------------------------------");
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso.");
        System.out.println("---------------------------------");

    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada. Ainda há saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada. Existe débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Foi depositado com sucesso a quantia de: R$" + v + " Da conta de: " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Foi sacado: R$" + v + " Da conta de: " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar em uma conta fechada.");
        }
    }

    public void pagarMensal() {
        float v = 0f;
        if ("CC".equals(this.getTipo())) {
            v = 12f;
        } else if ("CP".equals(this.getTipo())) {
            v = 20f;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Foi debitada a mensalidade no valor de: R$" + v);
        } else {
            System.out.println("Impossível pagar uma conta fechada.");
        }

    }

    // Metodos especiais.
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
