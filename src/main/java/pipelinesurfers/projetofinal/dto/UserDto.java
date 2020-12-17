package pipelinesurfers.projetofinal.dto;

import pipelinesurfers.projetofinal.model.User;
import lombok.Getter;
import lombok.Setter;

// DTO - Data Transfer Object
@Getter @Setter
public class UserDto {
    private String name;
    private String email;
    private String racf;

    public UserDto(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.racf = user.getRacf();
    }

   
    
    
}