package br.edu.infnet.appanuncio.model.domain;

import java.util.Date;

public class Anuncio {

    private String titulo;
    private String status;
    private Date dataCadastro;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "titulo='" + titulo + '\'' +
                ", status='" + status + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
