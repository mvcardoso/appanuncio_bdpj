package br.edu.infnet.appanuncio.model.domain;

import br.edu.infnet.appanuncio.interfaces.IPrinter;

public class Responsavel implements IPrinter {

    String nome;
    String telefone;
    String email;
    String senha;

    public Responsavel(String nome, String telefone, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Responsavel{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public void impressao(){
        System.out.println(">>>>>Responsavel<<<<<<<");
        System.out.println(this);
    }
}
