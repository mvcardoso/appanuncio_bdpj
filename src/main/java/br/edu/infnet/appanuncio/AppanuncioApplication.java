package br.edu.infnet.appanuncio;

import br.edu.infnet.appanuncio.model.domain.*;
import br.edu.infnet.appanuncio.model.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class AppanuncioApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppanuncioApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(AnuncioRepository repository, AutomovelRepository automovelRepository,
								 ItemRepository itemRepository, ResponsavelRepository responsavelRepository, UsuarioRepository usuarioRepository){
		return (args) -> {
			//Cria lista de itens
			Set<Item> itens = new HashSet<Item>();




			//Cria novo usuario
			Usuario u1 = new Usuario();
			u1.setNome("Usuario 01");
			u1.setEmail("u1@mail");
			u1.setSenha("123");

			//Cria novo Responsável
			Responsavel r1 = new Responsavel("Responsavel 01", "11111111", "r1@mail", "123");

			responsavelRepository.save(r1);

			//Cria novo automóvel
			Automovel auto1 = new Automovel("Marca 01", 30, "M01", true);
			auto1.setDescricaoCompleta("Carro 01");
			auto1.setPreco(50000.0);
			auto1.setUsuario(u1);
			//Salva o automóvel
			automovelRepository.save(auto1);

			//Adiciona itens na lista
			itens.add(auto1);

			//Cria novo anuncio
			Anuncio a1 = new Anuncio();

			//Seta valores do anuncio
			a1.setId(01);
			a1.setTitulo("Descrição 01");
			a1.setResponsavel(r1);
			a1.setStatus("Ativo");
			a1.setItens(itens);
			a1.setUsuario(u1);

			//Salva o anuncio
			repository.save(a1);
			System.out.println("Anuncio cadastrado com sucesso");


			//Recupera quantidade de automoveis
			System.out.println("Quantidade de automoveis: " + automovelRepository.count());

			//Busca automoveis por marca
         	System.out.println("Buscar automoveis por marca: "+ automovelRepository.findByMarca("Marca 01"));

			//Busca item por usuario
			System.out.println("Buscar item por usuário: "+ itemRepository.findAll(1));


		};
	}

}
