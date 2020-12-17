package pipelinesurfers.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pipelinesurfers.projetofinal.dao.ContagemDao;
import pipelinesurfers.projetofinal.model.Transacao;

@RestController
@CrossOrigin("*")
@RequestMapping("/transacao")
public class ContagemController {

    @Autowired // Injecao de dependencia
    private ContagemDao dao;

    @GetMapping("/all")
    public List<Transacao> listarTodos() {
        List<Transacao> lista = (List<Transacao>) dao.findAll();

        return lista;
    } 
    
}
