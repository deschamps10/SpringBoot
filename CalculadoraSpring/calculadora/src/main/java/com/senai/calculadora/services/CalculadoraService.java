package com.senai.calculadora.services;

import com.senai.calculadora.dtos.*;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {


    public ResultadoDTO somar(CalculadoraDTO dados){

        ResultadoDTO resultado = new ResultadoDTO();

        resultado.setNumberOne(dados.getNumberOne());
        resultado.setNumberTwo(dados.getNumberTwo());
        resultado.setResult(dados.getNumberOne() + dados.getNumberTwo());

        return resultado;
    }
    public ResultadoDTO subtrair(CalculadoraDTO dados){

        ResultadoDTO resultado = new ResultadoDTO();

        resultado.setNumberOne(dados.getNumberOne());
        resultado.setNumberTwo(dados.getNumberTwo());
        resultado.setResult(dados.getNumberOne() - dados.getNumberTwo());

        return resultado;
    }
    public ResultadoDTO dividir(CalculadoraDTO dados){

        ResultadoDTO resultado = new ResultadoDTO();

        resultado.setNumberOne(dados.getNumberOne());
        resultado.setNumberTwo(dados.getNumberTwo());
        resultado.setResult(dados.getNumberOne() / dados.getNumberTwo());

        return resultado;
    }
    public ResultadoDTO multiplicar(CalculadoraDTO dados){

        ResultadoDTO resultado = new ResultadoDTO();

        resultado.setNumberOne(dados.getNumberOne());
        resultado.setNumberTwo(dados.getNumberTwo());
        resultado.setResult(dados.getNumberOne() * dados.getNumberTwo());

        return resultado;
    }

}
