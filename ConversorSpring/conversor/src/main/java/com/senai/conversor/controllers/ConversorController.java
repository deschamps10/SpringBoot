package com.senai.conversor.controllers;

import com.senai.conversor.dtos.ConversorDTO;
import com.senai.conversor.dtos.ResultadoConversorDTO;
import com.senai.conversor.services.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversor")
public class ConversorController {

    @Autowired
    private ConversorService conService;

    @PostMapping("/temperatura")
    public ResponseEntity<ResultadoConversorDTO> temperatura(@RequestBody ConversorDTO dados) {
        ResultadoConversorDTO resultado = conService.converterTemperatura(dados);
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/massa")
    public ResponseEntity<ResultadoConversorDTO> massa(@RequestBody ConversorDTO dados) {
        ResultadoConversorDTO resultado = conService.converterMassa(dados);
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/comprimento")
    public ResponseEntity<ResultadoConversorDTO> comprimento(@RequestBody ConversorDTO dados) {
        ResultadoConversorDTO resultado = conService.converterComprimento(dados);
        return ResponseEntity.ok().body(resultado);
    }

    @PostMapping("/volume")
    public ResponseEntity<ResultadoConversorDTO> volume(@RequestBody ConversorDTO dados) {
        ResultadoConversorDTO resultado = conService.converterVolume(dados);
        return ResponseEntity.ok().body(resultado);
    }
}
