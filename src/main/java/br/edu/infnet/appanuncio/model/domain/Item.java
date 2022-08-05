package br.edu.infnet.appanuncio.model.domain;

public class Item {

    public String descricao;
    public Double preco;
    public Long id;

    @Override
    public String toString() {
        return "Item{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", id=" + id +
                '}';
    }
}
