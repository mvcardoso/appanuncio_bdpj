package br.edu.infnet.appanuncio.model.domain;

public class Automovel extends Item {

    private String marca;
    private Integer km;
    private String modelo;

    @Override
    public Double calcularPrecoComJuros(){
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
        System.out.println("###### Automovel #########");
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
