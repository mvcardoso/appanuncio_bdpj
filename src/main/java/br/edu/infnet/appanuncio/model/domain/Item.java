package br.edu.infnet.appanuncio.model.domain;

import br.edu.infnet.appanuncio.interfaces.IPrinter;
import br.edu.infnet.appanuncio.model.exceptions.KilometroInvalidoException;
import br.edu.infnet.appanuncio.model.exceptions.NotaInvalidaException;
import br.edu.infnet.appanuncio.model.exceptions.PrecoNegativoException;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "TItem")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Item implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    @ManyToMany(mappedBy = "itens")
    private Set<Anuncio> anuncio;

    private String descricaoCompleta;
    private Double preco;

    public abstract Double calcularPrecoComJuros() throws KilometroInvalidoException, PrecoNegativoException, NotaInvalidaException;

    @Override
    public String toString() {
        return "Item{" +
                "descricao='" + descricaoCompleta + '\'' +
                ", preco=" + preco +
                ", id=" + id +
                '}';
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Anuncio> getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Set<Anuncio> anuncio) {
        this.anuncio = anuncio;
    }
}
