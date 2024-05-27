package com.mirante.avaliacao.service;

import java.util.List;

import com.mirante.avaliacao.model.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mirante.avaliacao.repository.CidadeRepository;

//------------------------------------------------------------------
/** Service usado para acessar os repositórios da aplicação */
//------------------------------------------------------------------
@Service
public class ProjetoService {

	private CidadeRepository repository ;

	@Autowired
	public ProjetoService(CidadeRepository repository){
		this.repository = repository;
	}
	
	//---------------------------------------------------------
	/** Método que retorna todas as cidades cadastradas */
	//---------------------------------------------------------
	public List<Cidade> pesquisarCidades() {
		return (List<Cidade>) this.repository.findAll();
	}

	//----------------------------------------------------------
	/** Método chamado para incluir uma nova cidade */
	//----------------------------------------------------------	
	public void incluirCidade(Cidade cidade) {
		this.repository.save(cidade);
	}

	//----------------------------------------------------------
	/** Método chamado para alterar os dados de uma cidade */
	//----------------------------------------------------------	
	public void alterarCidade(Cidade cidade) {
		this.repository.save(cidade);
	}

	//----------------------------------------------------------
	/** Método chamado para excluir uma cidade */
	//----------------------------------------------------------	
	public void excluirCidade(Long idCidade) {
		this.repository.deleteById(idCidade);
	}
}
