/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06;

/**
 *
 * @author Lívia Martins Bastos
 */
public class Teste {
    public static void main(String[] args) {

        // cria um objeto da classe ContaBanco
        ContaBanco c1 = new ContaBanco();

        // define o nome do dono da conta
        c1.setDono("Livia");

        // abre a conta como conta corrente (cc)
        c1.abrirConta("cc");

        // deposita 100 reais na conta
        c1.depositar(100);

        // saca 30 reais da conta
        c1.sacar(30);

        // mostra o saldo final no console
        System.out.println("Saldo: " + c1.getSaldo());
    }
}
