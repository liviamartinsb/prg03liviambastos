/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Lívia Martins Bastos
 */
public class Main {
    public static void main(String[] args) {

        // cria um perfil de usuário (tipo do usuário no sistema)
        Perfil p1 = new Perfil("Administrador");

        // cria um usuário com nome, senha e associa ao perfil criado
        Usuario u1 = new Usuario("Livia", "123", p1);

        // testa login com senha correta
        // aqui deve mostrar "Login realizado!"
        u1.logar("123");

        // testa login com senha incorreta
        // aqui deve mostrar "Senha incorreta!"
        u1.logar("999");

        // cria uma sessão para o usuário (simulando usuário logado no sistema)
        Sessao s1 = new Sessao("abc123", u1);

        // cria um log de auditoria registrando a ação feita no sistema
        LogAuditoria log = new LogAuditoria("Login realizado", u1);

        // exibe os dados do usuário
        System.out.println("\n---- DADOS DO USUÁRIO ----");
        System.out.println(u1);

        // exibe os dados da sessão
        System.out.println("\n---- SESSÃO ----");
        System.out.println(s1);

        // exibe o log de auditoria
        System.out.println("\n---- LOG ----");
        System.out.println(log);
    }
}