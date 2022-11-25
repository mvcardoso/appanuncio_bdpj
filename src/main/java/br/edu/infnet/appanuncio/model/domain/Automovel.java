package br.edu.infnet.appanuncio.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TAutomovel")
public class Automovel extends Item {

    private String marca;
    private Integer km;
    private String modelo;
    private boolean garantia;

    public Automovel(){
    }

    public Automovel(String marca, Integer km, String modelo, boolean garantia) {
        this.marca = marca;
        this.km = km;
        this.modelo = modelo;
        this.garantia = garantia;
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

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }
}
