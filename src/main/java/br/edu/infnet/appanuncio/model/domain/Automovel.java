package br.edu.infnet.appanuncio.model.domain;

public class Automovel extends Item {

    public String marca;
    public Integer km;
    public String modelo;


    @Override
    public String toString() {
        return super.toString() +
                 "Automovel{" +
                "marca='" + marca + '\'' +
                ", km=" + km +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
