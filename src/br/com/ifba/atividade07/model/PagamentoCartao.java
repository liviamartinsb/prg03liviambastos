/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.model;

/**
 *
 * @author Lívia Martins Bastos
 */
public class PagamentoCartao implements Pagamento {

    // método que calcula o valor final com taxa
    public double calcular(double valor) {
        return valor * 1.05; // aplica 5% de taxa no valor
    }

    // método que gera o recibo do pagamento
    public String gerarRecibo(double valorFinal) {
        return "Pagamento no cartão - \nValor final: " + valorFinal;
    }
}
