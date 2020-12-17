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

@Entity // Sera armazenado no banco de dados
@Table(name = "tbl_usuario") // nome da tabela no banco de dados
@Getter @Setter @NoArgsConstructor
public class User {

    @Id // Indica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment 1,2,3
    @Column(name = "id")
    private int id;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "racf", length = 7, nullable = false, unique = true)
    private String racf;

    @Column(name = "senha", length = 30, nullable = false)
    private String senha;

 
        public User(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

}
