package br.edu.infnet.appanuncio.model.domain;

public class Servico extends Item {

    public String tipoServico;
    public String redeSocial;
    public Integer notaAvaliacao;

    @Override
    public String toString() {
        return  super.toString() +
                "Servico{" +
                "tipoServico='" + tipoServico + '\'' +
                ", redeSocial='" + redeSocial + '\'' +
                ", notaAvaliacao=" + notaAvaliacao +
                '}';
    }
}
