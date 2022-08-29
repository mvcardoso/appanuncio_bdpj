package br.edu.infnet.appanuncio.model.exceptions;

public class AnuncioSemItemException extends Exception {

    public static final long serialVersionUID = 1L;

    public AnuncioSemItemException(String mensagem){
        super(mensagem);
    }
}
