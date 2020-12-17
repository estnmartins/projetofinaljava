package pipelinesurfers.projetofinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "mtb310_ag_financeiro")
@Getter @Setter @NoArgsConstructor
public class AgenteFinanceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agente",insertable = false, updatable = false)
    private int id;

    @Column(name = "nome_agente", length = 200, nullable = false)
    private String nomeAgente;

    @Column(name = "volume_transacional", nullable = false)
    private double volumeTransacional;

    }