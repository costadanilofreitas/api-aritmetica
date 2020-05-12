package com.br.itau.controllers;

import com.br.itau.models.Matematica;
import com.br.itau.services.MatematicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/")
public class MatematicaController {

    @Autowired
    private MatematicaService matematicaService;

    @PostMapping("soma")
    public Integer soma(@RequestBody Matematica matematica){
        List<Integer> numeros = matematica.getNumeros();
        if (numeros.isEmpty() || numeros.size() < 2){
            throw new  ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "É necessario ao menos 2 numeros para serem somado");
        }
        return matematicaService.soma(numeros);
    }

    @PostMapping("subtracao")
    public Integer subtracao(@RequestBody Matematica matematica){
        List<Integer> numeros = matematica.getNumeros();
        if (numeros.isEmpty() || numeros.size() < 2){
            throw new  ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "É necessario ao menos 2 numeros para serem somado");
        }
        return matematicaService.subtracao(numeros);
    }

    @PostMapping("multiplicacao")
    public Integer multiplicacao(@RequestBody Matematica matematica){
        List<Integer> numeros = matematica.getNumeros();
        if (numeros.isEmpty() || numeros.size() < 2){
            throw new  ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "É necessario ao menos 2 numeros para serem somado");
        }
        return matematicaService.multiplicacao(numeros);
    }

    @PostMapping("divisao")
    public Integer divisao(@RequestBody Matematica matematica){
        List<Integer> numeros = matematica.getNumeros();
        if (numeros.isEmpty() || numeros.size() < 2){
            throw new  ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "É necessario ao menos 2 numeros para serem somado");
        }
        return matematicaService.divisao(numeros);
    }
}
