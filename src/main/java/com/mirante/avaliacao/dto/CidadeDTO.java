package com.mirante.avaliacao.dto;

import com.mirante.avaliacao.model.Cidade;

import lombok.*;

//-------------------------------------------------
/** DTO que guarda os dados de uma cidade */
//-------------------------------------------------
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CidadeDTO {

	//---------------------------------------
	// Atributos do DTO
	//---------------------------------------
    private Long id;
    private String nome;
    private String uf;
    private Boolean capital;
    
    
    //-----------------------------------------------
    /** Carrega o DTO com dados da entidade */
    //-----------------------------------------------
    public static CidadeDTO toDTO(Cidade cidade) {
        return new CidadeDTO(cidade.getId(), cidade.getNome(), cidade.getUf(), cidade.getCapital());
    }
    //-----------------------------------------------
    /** Carrega a entidade com dados do DTO */
    //-----------------------------------------------
    public Cidade toObject(){
        return new Cidade(id, nome, uf, capital);
    }

}