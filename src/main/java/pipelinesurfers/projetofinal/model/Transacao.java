package pipelinesurfers.projetofinal.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table(name = "mtb310_transaction")
@Getter @Setter
public class Transacao {

    @Id
    @Column(name = "id_transacao")
    private int id_transacao;

    @Column(name = "data_hora", length = 255, nullable = false)
    private String data_hora;

    @Column(name = "dispositivo")
    private int dispositivo;

    @Column(name = "valor_solic")
    private double valor_solic;

    @Column(name = "valor_aut")
    private double valor_aut;

    @Column(name = "status")
    private int status;
    
}
 