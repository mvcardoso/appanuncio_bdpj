package br.edu.infnet.appanuncio.model.domain;

import br.edu.infnet.appanuncio.model.exceptions.KilometroInvalidoException;

public class Automovel extends Item {

    private String marca;
    private Integer km;
    private String modelo;

    @Override
    public Double calcularPrecoComJuros() throws KilometroInvalidoException{
        if(km < 0){
            throw new KilometroInvalidoException("Kilometro abaixo de 0");
        }
        Integer valorKm = km > 50 ? 1000:500;
        return getPreco() + valorKm;
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
      System.out.println(this);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
