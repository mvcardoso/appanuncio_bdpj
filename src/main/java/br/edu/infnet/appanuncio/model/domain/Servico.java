package br.edu.infnet.appanuncio.model.domain;

public class Servico extends Item {

    public String tipoServico;
    public String redeSocial;
    public Double notaAvaliacao;

    @Override
    public Double calcularPrecoComJuros(){
        Double mediaNota = notaAvaliacao/2;

        return getPreco() + mediaNota;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Servico{" +
                "tipoServico='" + tipoServico + '\'' +
                ", redeSocial='" + redeSocial + '\'' +
                ", notaAvaliacao=" + notaAvaliacao +
                '}';
    }

    @Override
    public void impressao(){
        System.out.println(">>>>>Servico<<<<<<<");
        System.out.println(this);
    }
}
