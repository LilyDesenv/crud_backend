package com.mirante.avaliacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirante.avaliacao.model.Cidade;

import java.util.Optional;

//----------------------------------------------
/** Repositório para entidade Cidade */
//----------------------------------------------
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
