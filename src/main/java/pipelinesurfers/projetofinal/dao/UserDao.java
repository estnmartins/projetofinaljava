package pipelinesurfers.projetofinal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pipelinesurfers.projetofinal.model.User;

// CRUD - Create Read Update Delete
public interface UserDao extends CrudRepository<User, Integer> {
    public User findByEmail(String email);
    public User findByEmailAndSenha(String email, String senha);
    public User findByEmailOrRacf(String email, String racf);

/*     @Query(value="Select new User(u.name, u.email) from User u where u.id = :cod")
    public User buscaPorId(@Param("cod") Integer codigo);
 */
    @Query(value = "Select nome,email from tbl_usuario where id = :cod", nativeQuery = true)
    public Object buscarUsuariosPorId(@Param("cod") Integer codigo); // quando retornar mais de um resultado utilizar [COLCHETES] no object
}
