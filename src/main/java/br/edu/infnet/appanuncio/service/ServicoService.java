package br.edu.infnet.appanuncio.service;

import br.edu.infnet.appanuncio.model.domain.Servico;
import br.edu.infnet.appanuncio.model.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;


    public void incluir (Servico servico){
        servicoRepository.save(servico);
    }


    public Collection<Servico> obterLista(){

        return (Collection<Servico>) servicoRepository.findAll();
    }

    public void excluir(Integer id){
        servicoRepository.deleteById(id);
    }
}
