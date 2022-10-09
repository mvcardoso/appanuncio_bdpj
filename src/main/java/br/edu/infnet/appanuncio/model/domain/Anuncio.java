package br.edu.infnet.appanuncio.model.domain;

import br.edu.infnet.appanuncio.interfaces.IPrinter;
import br.edu.infnet.appanuncio.model.exceptions.AnuncioSemItemException;
import br.edu.infnet.appanuncio.model.exceptions.ResponsavelNuloException;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "TAnuncio")
public class Anuncio implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idResponsavel")
    private Responsavel responsavel;

    @ManyToMany(cascade = CascadeType.DETACH)
    private Set<Item> itens;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    private String titulo;
    private String status;
    private LocalDateTime dataCadastro;

    public Anuncio(){
        this.dataCadastro = LocalDateTime.now();
    }

    public Anuncio(Responsavel responsavel, Set<Item> itens) throws ResponsavelNuloException, AnuncioSemItemException {
        this();
        if (responsavel == null) {
            throw new ResponsavelNuloException("Responsável não pode ser nulo");
        }

        if (itens.size() < 1) {
            throw new AnuncioSemItemException("Anúncio deve ter item");
        }

        if (itens == null) {
            throw new AnuncioSemItemException("Anúncio deve ter item");
        }

        this.responsavel = responsavel;
        this.itens = itens;
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

    @Override
    public void impressao() {
        System.out.println(this);
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
