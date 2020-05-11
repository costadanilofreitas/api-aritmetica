package com.br.itau.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatematicaService {

    public int soma(List<Integer> numeros){
        int resultado = 0;
        for(int numero: numeros){
            resultado += numero;
        }
        return resultado;
    }
}
