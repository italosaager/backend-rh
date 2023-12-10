package com.backendrh.Backend.RH.model;
import jakarta.persistence.*;

@Entity
@Table(name = "vagas")
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cidade;

    @ManyToOne
    @JoinColumn(name = "id_tipo_vaga", referencedColumnName = "id")
    private TipoVaga tipoVaga;

}