package pipelinesurfers.projetofinal.dto;

import pipelinesurfers.projetofinal.model.User;
import lombok.Getter;
import lombok.Setter;

// DTO - Data Transfer Object
@Getter @Setter
public class UserDto {
    private String nome;
    private String email;
    private String racf;

    public UserDto(User user) {
        this.nome = user.getNome();
        this.email = user.getEmail();
        this.racf = user.getRacf();
    }

   
    
    
}