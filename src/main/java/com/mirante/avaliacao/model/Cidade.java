package com.mirante.avaliacao.model;

import jakarta.persistence.*;
import lombok.*;

//-------------------------------------------------
/** Entidade que guarda os dados de uma cidade */
//-------------------------------------------------
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;
    
    @Column(name = "UF", length = 100, nullable = false)
    private String uf;
    
    @Column(name = "capital", nullable = false)
    private Boolean capital;

}