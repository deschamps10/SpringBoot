package com.senai.conversor.services;

import com.senai.conversor.dtos.ConversorDTO;
import com.senai.conversor.dtos.ResultadoConversorDTO;
import org.springframework.stereotype.Service;

@Service
public class ConversorService {

    public ResultadoConversorDTO converterTemperatura(ConversorDTO dados) {
        ResultadoConversorDTO retorno = new ResultadoConversorDTO();
        retorno.setDestinationOrigin(dados.getDestinationOrigin());

        if (dados.getUnitOrigin() == null) {
            retorno.setResult(null); // ou definir um valor padrão, se desejado
            return retorno;
        }

        if (dados.getUnitOrigin().equalsIgnoreCase("C")) {
            // Converter Celsius para Fahrenheit
            retorno.setResult((dados.getValue() * 9 / 5) + 32);
        } else if (dados.getUnitOrigin().equalsIgnoreCase("F")) {
            // Converter Fahrenheit para Celsius
            retorno.setResult((dados.getValue() - 32) * 5 / 9);
        } else {
            // Unidade inválida
            retorno.setResult(null); // ou definir um valor padrão, se desejado
        }

        return retorno;
    }

    public ResultadoConversorDTO converterMassa(ConversorDTO dados) {
        ResultadoConversorDTO retorno = new ResultadoConversorDTO();
        retorno.setDestinationOrigin(dados.getDestinationOrigin());

        if (dados.getUnitOrigin() == null) {
            retorno.setResult(null); // ou definir um valor padrão, se desejado
            return retorno;
        }

        if (dados.getUnitOrigin().equalsIgnoreCase("g")) {
            // Converter gramas para quilogramas
            retorno.setResult(dados.getValue() / 1000);
        } else if (dados.getUnitOrigin().equalsIgnoreCase("kg")) {
            // Converter quilogramas para gramas
            retorno.setResult(dados.getValue() * 1000);
        } else {
            // Unidade inválida
            retorno.setResult(null); // ou definir um valor padrão, se desejado
        }

        return retorno;
    }

    public ResultadoConversorDTO converterComprimento(ConversorDTO dados) {
        ResultadoConversorDTO retorno = new ResultadoConversorDTO();
        retorno.setDestinationOrigin(dados.getDestinationOrigin());

        if (dados.getUnitOrigin() == null) {
            retorno.setResult(null); // ou definir um valor padrão, se desejado
            return retorno;
        }

        if (dados.getUnitOrigin().equalsIgnoreCase("M")) {
            // Converter metros para centímetros
            retorno.setResult(dados.getValue() * 100);
        } else if (dados.getUnitOrigin().equalsIgnoreCase("CM")) {
            // Converter centímetros para metros
            retorno.setResult(dados.getValue() / 100);
        } else {
            // Unidade inválida
            retorno.setResult(null); // ou definir um valor padrão, se desejado
        }

        return retorno;
    }

    public ResultadoConversorDTO converterVolume(ConversorDTO dados) {
        ResultadoConversorDTO retorno = new ResultadoConversorDTO();
        retorno.setDestinationOrigin(dados.getDestinationOrigin());

        if (dados.getUnitOrigin() == null) {
            retorno.setResult(null); // ou definir um valor padrão, se desejado
            return retorno;
        }

        if (dados.getUnitOrigin().equalsIgnoreCase("L")) {
            // Converter litros para mililitros
            retorno.setResult(dados.getValue() * 1000);
        } else if (dados.getUnitOrigin().equalsIgnoreCase("ML")) {
            // Converter mililitros para litros
            retorno.setResult(dados.getValue() / 1000);
        } else {
            // Unidade inválida
            retorno.setResult(null); // ou definir um valor padrão, se desejado
        }

        return retorno;
    }
}
