package br.edu.infnet.appanuncio.model.domain;

public class Automovel extends Item {

    public String marca;
    public Integer km;
    public String modelo;

    @Override
    public Double calcularPrecoComJuros(){
        Integer valorKm = km > 50 ? 1000:500;
        return super.calcularPrecoComJuros() + valorKm;
    }

    @Override
    public String toString() {
        return super.toString() +
                 "Automovel{" +
                "marca='" + marca + '\'' +
                ", km=" + km +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void impressao(){
        System.out.println("###### Automovel #########");
        System.out.println(this);
    }

}
