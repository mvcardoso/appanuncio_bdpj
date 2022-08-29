package br.edu.infnet.appanuncio.model.domain;

import br.edu.infnet.appanuncio.interfaces.IPrinter;
import br.edu.infnet.appanuncio.model.exceptions.KilometroInvalidoException;
import br.edu.infnet.appanuncio.model.exceptions.NotaInvalidaException;
import br.edu.infnet.appanuncio.model.exceptions.PrecoNegativoException;

import java.util.Objects;

public abstract class Item implements IPrinter {

    private String descricaoCompleta;
    private Double preco;
    private Integer id;


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
}
