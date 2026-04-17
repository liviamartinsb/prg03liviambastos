/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.model;

/**
 *
 * @author Lívia Martins Bastos
 */
public class PagamentoPix implements Pagamento {

    // método que calcula o valor final com cashback
    public double calcular(double valor) {
        return valor * 0.98; // aplica 2% de cashback (desconto)
    }

    // método que gera o recibo do pagamento
    public String gerarRecibo(double valorFinal) {
        return "Pagamento via PIX - \nValor final: " + valorFinal;
    }
}
