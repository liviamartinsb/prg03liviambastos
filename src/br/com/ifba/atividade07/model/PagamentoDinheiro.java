/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.model;

/**
 *
 * @author Lívia Martins Bastos
 */
public class PagamentoDinheiro implements Pagamento {

    // método que calcula o valor final com desconto
    public double calcular(double valor) {
        return valor * 0.9; // aplica 10% de desconto no valor
    }

    // método que gera o recibo do pagamento
    public String gerarRecibo(double valorFinal) {
        return "Pagamento em dinheiro - \nValor final: " + valorFinal;
    }
}
