package br.edu.infnet.appanuncio.model.domain;

public class Imovel extends Item {

        private String tipoImovel;
        private String cidade;
        private Integer area;

        public String getTipoImovel() {
                return tipoImovel;
        }

        public void setTipoImovel(String tipoImovel) {
                this.tipoImovel = tipoImovel;
        }

        public String getCidade() {
                return cidade;
        }

        public void setCidade(String cidade) {
                this.cidade = cidade;
        }

        public Integer getArea() {
                return area;
        }

        public void setArea(Integer area) {
                this.area = area;
        }

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
