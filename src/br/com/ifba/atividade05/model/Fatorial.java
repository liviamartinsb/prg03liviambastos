/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade05.model;

/**
 *
 * @author Lívia Martins Bastos
 */
public class Fatorial {
   // Armazena o valor digitado pelo usuário
private int valor;

// Armazena o resultado do fatorial
private int fatorial;

// Armazena a fórmula (ex: 5 x 4 x 3 x 2 x 1)
private String formula;

// Recebe o valor e chama o cálculo
public void setValor(int n) {
    this.valor = n;
    calcular();
}

// Retorna o resultado do fatorial
public int getFatorial() {
    return fatorial;
}

// Retorna a fórmula do cálculo
public String getFormula() {
    return formula;
}

// Método que faz o cálculo do fatorial e monta a fórmula
private void calcular() {
    int f = 1; // variável auxiliar para o cálculo
    String s = ""; // variável auxiliar para montar a fórmula

    // Loop que calcula o fatorial
    for (int i = valor; i >= 1; i--) {
        f *= i; // multiplica os valores
        s += i; // adiciona o número na string

        // Adiciona " x " entre os números
        if (i > 1) {
            s += " x ";
        }
    }

    // Guarda os resultados nas variáveis da classe
    this.fatorial = f;
    this.formula = s;
}
}
