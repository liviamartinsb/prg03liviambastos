/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Lívia Martins Bastos
 */
public class Usuario {

    // atributos do usuário
    private String nome;
    private String senha;
    private Perfil perfil; // relacionamento com a classe Perfil

    // construtor que recebe os dados do usuário
    public Usuario(String nome, String senha, Perfil perfil) {
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
    }

    // método para realizar login
    public void logar(String senhaDigitada) {
        // verifica se a senha digitada é igual à senha cadastrada
        if (this.senha.equals(senhaDigitada)) {
            System.out.println("Login realizado!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    // método toString para mostrar os dados do usuário
    @Override
    public String toString() {
        return "Usuario: " + nome + " - " + perfil;
    }
}