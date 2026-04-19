/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Lívia Martins Bastos
 */
public class Sessao {

    // atributos da sessão
    private String token;
    private Usuario usuario; // relacionamento com Usuario

    // construtor que recebe o token e o usuário
    public Sessao(String token, Usuario usuario) {
        this.token = token;
        this.usuario = usuario;
    }

    // método toString para mostrar a sessão
    @Override
    public String toString() {
        return "Sessao do usuario: " + usuario;
    }
}
