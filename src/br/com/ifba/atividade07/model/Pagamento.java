/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade07.model;

/**
 *
 * @author Lívia Martins Bastos
 */
public interface Pagamento {
// método responsável por calcular o valor final do pagamento
// recebe o valor original e retorna o valor com desconto ou taxa
double calcular(double valor);

// método responsável por gerar um recibo do pagamento
// recebe o valor final já calculado e retorna uma mensagem com o resultado
String gerarRecibo(double valorFinal);
}
