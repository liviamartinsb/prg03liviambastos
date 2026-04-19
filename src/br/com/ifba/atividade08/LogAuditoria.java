/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Lívia Martins Bastos
 */
public class LogAuditoria {

    // atributos do log
    private String acao;
    private Usuario usuario; // relacionamento com Usuario

    // construtor que recebe a ação e o usuário
    public LogAuditoria(String acao, Usuario usuario) {
        this.acao = acao;
        this.usuario = usuario;
    }

    // método toString para mostrar o log
    @Override
    public String toString() {
        return "Log: " + acao + " - Usuario: " + usuario;
    }
}