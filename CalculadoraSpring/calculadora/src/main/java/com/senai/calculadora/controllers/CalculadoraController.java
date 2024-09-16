package com.senai.calculadora.controllers;

import com.senai.calculadora.dtos.*;
import com.senai.calculadora.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
     CalculadoraService calcSerivce;

@PostMapping("/somar")
    public ResponseEntity<ResultadoDTO> somar(@RequestBody CalculadoraDTO dados){

        ResultadoDTO resultado = calcSerivce.somar(dados);
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/subtrair")
    public ResponseEntity<ResultadoDTO> subtrair(@RequestBody CalculadoraDTO dados){

        ResultadoDTO resultado = calcSerivce.subtrair(dados);
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/dividir")
    public ResponseEntity<ResultadoDTO> dividir(@RequestBody CalculadoraDTO dados){

        ResultadoDTO resultado = calcSerivce.dividir(dados);
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/multiplicar")
    public ResponseEntity<ResultadoDTO> multiplicar(@RequestBody CalculadoraDTO dados){

        ResultadoDTO resultado = calcSerivce.multiplicar(dados);
        return ResponseEntity.ok().body(resultado);
    }

}
