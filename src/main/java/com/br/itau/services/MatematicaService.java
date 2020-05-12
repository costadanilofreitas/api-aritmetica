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

    public int subtracao(List<Integer> numeros){
        int resultado = 0;
        for(int numero: numeros){
            if (resultado == 0){
                resultado = numero;
            } else {
                resultado = resultado - numero;
            }
        }
        return resultado;
    }

    public int multiplicacao(List<Integer> numeros){
        int resultado = 0;
        for(int numero: numeros){
            if (resultado == 0){
                resultado = numero;
            } else {
                resultado = resultado * numero;
            }
        }
        return resultado;
    }

    public int divisao(List<Integer> numeros){
        int resultado = 0;
        for(int numero: numeros){
            if (resultado == 0){
                resultado = numero;
            } else {
                resultado = resultado / numero;
            }
        }
        return resultado;
    }
}
