package br.edu.infnet.appanuncio.model.exceptions;

public class PrecoNegativoException extends Exception {

    public static final long serialVersionUID = 1L;

    public PrecoNegativoException(String mensagem){
        super(mensagem);
    }
}
