package br.edu.infnet.appanuncio.model.domain;

import br.edu.infnet.appanuncio.interfaces.IPrinter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class Anuncio implements IPrinter {

    private String titulo;
    private String status;
    private LocalDateTime dataCadastro;
    private Responsavel responsavel;
    private Set<Item> itens;
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Anuncio(Responsavel responsavel) {
        this.dataCadastro = LocalDateTime.now();
        this.responsavel = responsavel;
    }

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



    @Override
    public String toString() {
        return "Anuncio {" +
                "\ntitulo='" + titulo + '\'' +
                ", \nstatus='" + status + '\'' +
                ", \ndataCadastro=" + dataCadastro +
                " \n"+ responsavel +
                "\nQuantidade de Anuncios=" + itens.size() +
                '}';
    }

    @Override
    public void impressao(){
        System.out.println(">>>>>Anuncio<<<<<");
        System.out.println(this);
    }

    public Set<Item> getItens() {
        return itens;
    }

    public void setItens(Set<Item> itens) {
        this.itens = itens;
    }
}
