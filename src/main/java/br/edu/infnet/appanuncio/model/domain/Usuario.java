package br.edu.infnet.appanuncio.model.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TUsuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    @JoinColumn(name="idUsuario")
    private List<Responsavel> responsavel;

    @OneToMany
    @JoinColumn(name="idUsuario")
    private List<Item> item;

    @OneToMany
    @JoinColumn(name="idUsuario")
    private List<Anuncio> anuncio;

    private String nome;
    private String telefone;
    private String email;
    private String senha;

    public Usuario() {}

    public Usuario(String nome, String telefone, String email, String senha) {
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

    public List<Responsavel> getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(List<Responsavel> responsavel) {
        this.responsavel = responsavel;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public List<Anuncio> getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(List<Anuncio> anuncio) {
        this.anuncio = anuncio;
    }
}
