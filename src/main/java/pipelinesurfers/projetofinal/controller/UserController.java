package pipelinesurfers.projetofinal.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping("/loginemail")
    public ResponseEntity<UserDto> loginPorEmail(@RequestBody User user) {
        User userFinded = dao.findByEmailAndSenha(user.getEmail(), user.getSenha());

        if (userFinded != null) {
            UserDto userDto = new UserDto(userFinded);
            return ResponseEntity.ok(userDto);
        }
        return ResponseEntity.notFound().build();
    }

    

    @PostMapping("/loginracf")
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
}