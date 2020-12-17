package pipelinesurfers.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import pipelinesurfers.projetofinal.model.Transacao;

public interface ContagemDao extends CrudRepository<Transacao, Integer> {
 /*    public Transacao findByStatus(int status);
 
    @Query("SELECT new br.paduan.projFinal.dto.ContagemStatus(t.agente.nomeAgente, status, COUNT(t.status)) FROM Transacao AS t WHERE t.agente.idAgente = ?1 GROUP BY t.agente.nomeAgente, t.status ORDER By status")
    List<ContagemStatus> countStatusByAgent(int idAgente); 
    @Query(value = "Select * from mtb310_transaction", nativeQuery = true)
     public Object buscarUsuariosPorId(@Param("cod") Integer codigo);  */

}
