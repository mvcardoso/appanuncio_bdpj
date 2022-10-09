package br.edu.infnet.appanuncio.service;

import br.edu.infnet.appanuncio.model.domain.Automovel;
import br.edu.infnet.appanuncio.model.domain.Item;
import br.edu.infnet.appanuncio.model.domain.Usuario;
import br.edu.infnet.appanuncio.model.repository.AutomovelRepository;
import br.edu.infnet.appanuncio.model.repository.ItemRepository;
import br.edu.infnet.appanuncio.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

//    public void incluir (Item item){
//        itemRepository.save(item);
//        AppImpressao.relatorio("++++++++Inclusão Item++++++++++++++++++++++++++++++++++++++++ "
//                        + "\n",
//                item);
//    }


    public List<Item> obterLista(){

        return (List<Item>) itemRepository.findAll();
    }

    public List<Item> obterLista(Usuario usuario){

        return (List<Item>) itemRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id){
        itemRepository.deleteById(id);
    }
}
