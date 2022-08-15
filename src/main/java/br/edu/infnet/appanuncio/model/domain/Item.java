package br.edu.infnet.appanuncio.model.domain;

import br.edu.infnet.appanuncio.interfaces.IPrinter;

public abstract class Item implements IPrinter {

    private String descricaoCompleta;
    private Double preco;
    private  Long id;

    public abstract Double calcularPrecoComJuros();

//    public Double calcularPrecoComJuros(){
//        preco += preco * 0.015;
//        return preco;
//    }

//    public abstract void impressao();
//    @Override
//    public void impressao(){
//
//    }

    @Override
    public String toString() {
        return "Item{" +
                "descricao='" + descricaoCompleta + '\'' +
                ", preco=" + preco +
                ", id=" + id + "; Preco com juros: " + calcularPrecoComJuros() +
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
