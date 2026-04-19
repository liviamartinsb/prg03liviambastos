/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Lívia Martins Bastos
 */
public class Perfil {

    // atributo que guarda o nome do perfil (ex: admin, usuário)
    private String nome;

    // construtor que recebe o nome do perfil
    public Perfil(String nome) {
        this.nome = nome;
    }

    // método para pegar o nome do perfil
    public String getNome() {
        return nome;
    }

    // método para alterar o nome do perfil
    public void setNome(String nome) {
        this.nome = nome;
    }

    // método toString para mostrar o perfil em forma de texto
    @Override
    public String toString() {
        return "Perfil: " + nome;
    }
}