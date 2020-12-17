package pipelinesurfers.projetofinal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pipelinesurfers.projetofinal.dao.UserDao;
import pipelinesurfers.projetofinal.dto.UserDto;
import pipelinesurfers.projetofinal.model.User;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")

public class UserController {

    @Autowired // Injecao de dependencia
    private UserDao dao;

 @GetMapping("/all")
    public List<User> listarTodos() {
        List<User> lista = (List<User>) dao.findAll();

        return lista;
    } 

   /*  @GetMapping("/id/{id}") // {Nome da variavel}
    public ResponseEntity<User> BuscaPorId(@PathVariable int id) { // int id - nome precisa ser igual ao declarado no
                                                                   // GETMAPPING
        User user = dao.findById(id).orElse(null);

        if (user != null) {
            user.setSenha("******");
            return ResponseEntity.ok(user); // ok = 200
            
        }
        return ResponseEntity.notFound().build(); // // not found 404
    } */

   /*  @PostMapping("/new")
    public ResponseEntity<User> novoUsuario(@RequestBody User user){
        User newUser = dao.save(user);
        return ResponseEntity.ok(newUser);

    } 
 */
   /*  @PostMapping("/email")
    public ResponseEntity<UserDto> buscaPorEmail(@RequestBody User user) {
        User userFinded = dao.findByEmail(user.getEmail());

        if (userFinded != null) {
            UserDto userDto = new UserDto(userFinded);
            return ResponseEntity.ok(userDto);
        }
        return ResponseEntity.notFound().build();
    } */

    @PostMapping("/loginemail")
    public ResponseEntity<UserDto> loginPorEmail(@RequestBody User user) {
        User userFinded = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());

        if (userFinded != null) {
            UserDto userDto = new UserDto(userFinded);
            return ResponseEntity.ok(userDto);
        }
        return ResponseEntity.notFound().build();
    }

/*     @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody User user) {
        User userFinded = dao.findByEmailOrRacf(user.getEmail(), user.getRacf());

        if (userFinded != null) {
            if (user.getSenha().equals(userFinded.getSenha())) {
                UserDto userDto = new UserDto(userFinded);
                return ResponseEntity.ok(userDto); 
            }
            //return ResponseEntity.status(401).build();
        }
        return ResponseEntity.status(401).build();
    }
 */
   /*  @GetMapping("/id3/{id}")
    public ResponseEntity<Object> buscarUserPersonalizado(@PathVariable int id){
        Object userFinded = dao.buscarUsuariosPorId(id);

        if(userFinded != null){
            return ResponseEntity.ok(userFinded);

        }
        return ResponseEntity.notFound().build();


    } */

}
