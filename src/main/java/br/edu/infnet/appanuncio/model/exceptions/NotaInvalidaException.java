package br.edu.infnet.appanuncio.model.exceptions;

public class NotaInvalidaException extends Exception {

    public static final long serialVersionUID = 1L;

    public NotaInvalidaException(String mensagem){
        super(mensagem);
    }
}
