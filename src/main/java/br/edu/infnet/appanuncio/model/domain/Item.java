package br.edu.infnet.appanuncio.model.domain;

public abstract class Item {

    public String descricaoCompleta;
    public Double preco;
    public Long id;

    public Double calcularPrecoComJuros(){
        preco += preco * 0.015;
        return preco;
    }

    public abstract void impressao();

    @Override
    public String toString() {
        return "Item{" +
                "descricao='" + descricaoCompleta + '\'' +
                ", preco=" + preco +
                ", id=" + id + "; Preco com juros: " + calcularPrecoComJuros() +
                '}';
    }
}
