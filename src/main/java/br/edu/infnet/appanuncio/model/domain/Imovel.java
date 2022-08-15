package br.edu.infnet.appanuncio.model.domain;

public class Imovel extends Item {

        public String tipoImovel;
        public String cidade;
        public Integer area;

        @Override
        public Double calcularPrecoComJuros() {
                return getPreco() * 0.015;
        }

        @Override
        public String toString() {
                return  super.toString() +
                        "Imovel{" +
                        "tipoImovel='" + tipoImovel + '\'' +
                        ", cidade='" + cidade + '\'' +
                        ", area=" + area +
                        '}';
        }

        @Override
        public void impressao(){
                System.out.println("------ Imovel--------");
                System.out.println(this);
        }
}
