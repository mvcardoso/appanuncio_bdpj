package br.edu.infnet.appanuncio.model.domain;

import br.edu.infnet.appanuncio.interfaces.IPrinter;
import br.edu.infnet.appanuncio.model.exceptions.NomeInvalidoException;

public class Usuario implements IPrinter {

    private String nome;
    private String telefone;
    private String email;
    private String senha;
    private Integer id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario() {

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
