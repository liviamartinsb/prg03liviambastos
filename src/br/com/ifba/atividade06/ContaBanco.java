/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06;

/**
 *
 * @author Lívia Martins Bastos
 */
public class ContaBanco {
   

    // atributos da conta
    private int numConta;      // número da conta
    private String tipo;       // tipo da conta (cc ou cp)
    private String dono;       // nome do dono da conta
    private double saldo;      // saldo atual da conta
    private boolean status;    // indica se a conta está aberta ou fechada

    // construtor: inicia a conta com saldo 0 e fechada
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    // método para abrir conta
    public void abrirConta(String tipo) {
        this.tipo = tipo;      // define o tipo da conta
        this.status = true;    // muda o status para aberta

        // dependendo do tipo, já recebe um valor inicial
        if (tipo.equals("cc")) {
            this.saldo = 50;   // conta corrente ganha 50
        } else if (tipo.equals("cp")) {
            this.saldo = 150;  // conta poupança ganha 150
        }
    }

    // método para fechar conta
    public void fecharConta() {
        // só pode fechar se não tiver dinheiro nem dívida
        if (this.saldo > 0) {
            System.out.println("Conta com dinheiro, não pode fechar!");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito, não pode fechar!");
        } else {
            this.status = false; // fecha a conta
            System.out.println("Conta fechada!");
        }
    }

    // método para depositar dinheiro
    public void depositar(double valor) {
        // só pode depositar se a conta estiver aberta
        if (this.status) {
            this.saldo += valor;
        } else {
            System.out.println("Conta fechada!");
        }
    }

    // método para sacar dinheiro
    public void sacar(double valor) {
        // só pode sacar se a conta estiver aberta
        if (this.status) {
            // verifica se tem saldo suficiente
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Conta fechada!");
        }
    }

    // método para pagar mensalidade
    public void pagarMensal() {
        // cobra valor diferente dependendo do tipo
        if (this.tipo.equals("cc")) {
            this.saldo -= 12;
        } else if (this.tipo.equals("cp")) {
            this.saldo -= 20;
        }
    }

    // GETTERS E SETTERS (para acessar e alterar os atributos)

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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}

