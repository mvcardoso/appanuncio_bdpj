package br.edu.infnet.appanuncio.model.exceptions;

public class KilometroInvalidoException extends Exception {

    public static final long serialVersionUID = 1L;

    public KilometroInvalidoException(String mensagem){
        super(mensagem);
    }
}
