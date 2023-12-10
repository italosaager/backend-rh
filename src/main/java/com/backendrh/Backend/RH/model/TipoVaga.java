package com.backendrh.Backend.RH.model;
import jakarta.persistence.*;

@Entity
@Table(name = "tipo_vaga")
public class TipoVaga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

}