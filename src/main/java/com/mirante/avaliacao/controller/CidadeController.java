package com.mirante.avaliacao.controller;

import java.util.List;

import com.mirante.avaliacao.model.Cidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mirante.avaliacao.dto.CidadeDTO;
import com.mirante.avaliacao.service.ProjetoService;

//--------------------------------------------------
/** Endpoint para consultar e manter cidades */
//--------------------------------------------------
@RestController
@CrossOrigin
@RequestMapping("/cidades")
public class CidadeController {


	private final ProjetoService service ;

	@Autowired
	public CidadeController(ProjetoService service){
		this.service = service;
	}
	
	//----------------------------------------------------------
	/** Endpoint que retorna todas as cidades cadastradas */
	//----------------------------------------------------------
	@GetMapping
	public List<Cidade> pesquisarCidades() {
		// TODO: Responde GET em http://localhost:8080/mirante/cidades
		return service.pesquisarCidades();
	}
	
	//----------------------------------------------------------
	/** Endpoint para incluir nova cidade */
	//----------------------------------------------------------
	@PostMapping
	public void incluirCidade(@RequestBody(required = true) CidadeDTO dto) {
		//	TODO: Responde POST em http://localhost:8080/mirante/cidades
		//	Envia JSON no body:
		//	{
		//	 	"nome": "Florianópolis",
		//	  	"uf": "SC",
		//	   	"capital": true
		//	}
		service.incluirCidade(dto.toObject());
	}	
	
	//----------------------------------------------------------
	/** Endpoint para alterar cidade */
	//----------------------------------------------------------
	@PutMapping
	public void alterarCidade(@RequestBody(required = true) CidadeDTO dto) {
		// TODO: Responde PUT em http://localhost:8080/mirante/cidades
		//   Envia JSON no body:
		//   {
		//     "id": 11,
		//     "nome": "Blumenau",
		//     "uf": "SC",
		//     "capital": false
		//   }

		service.alterarCidade(dto.toObject());
	}		
	
	//----------------------------------------------------------
	/** Endpoint para excluir uma cidade */
	//----------------------------------------------------------
	@DeleteMapping("/{id}")
	public void excluirCidade(@PathVariable("id") Long idCidade) {
		// Responde DELETE em http://localhost:8080/mirante/cidades/{idCidade}
		service.excluirCidade(idCidade);
	}	
}
