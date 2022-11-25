package br.edu.infnet.appanuncio.model.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "TAnuncio")
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idResponsavel")
    private Responsavel responsavel;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Item> itens;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    private String titulo;
    private String status;
    private LocalDateTime dataCadastro;

    public Anuncio(Responsavel responsavel, Set<Item> itens) {
        this();

        this.responsavel = responsavel;
        this.itens = itens;
    }

    public Anuncio(){
        this.dataCadastro = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Anuncio {" +
                "\ntitulo='" + titulo + '\'' +
                ", \nstatus='" + status + '\'' +
                ", \ndataCadastro=" + dataCadastro +
                " \n" + responsavel +
                "\nQuantidade de Anuncios=" + itens.size() +
                '}';
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }


    public Set<Item> getItens() { return itens; }

    public void setItens(Set<Item> itens) { this.itens = itens;  }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
