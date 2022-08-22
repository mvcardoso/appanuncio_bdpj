package br.edu.infnet.appanuncio.model.domain;

public class Servico extends Item {

    private String tipoServico;
    private String redeSocial;
    private Double notaAvaliacao;

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    public Double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(Double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

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
