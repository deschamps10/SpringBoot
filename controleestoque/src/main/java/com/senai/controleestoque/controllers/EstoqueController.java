package com.senai.controleestoque.controllers;

import com.senai.controleestoque.dtos.*;
import com.senai.controleestoque.models.*;
import com.senai.controleestoque.services.EstoqueService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estoques")
public class EstoqueController {

    @Autowired
     EstoqueService estoqueService;

    @PostMapping("/criar") //asinatura de metodo
    public ResponseEntity<ResultadoDTO> createEstoque(@RequestBody ControleDTO dados) {
            
        boolean retorno = estoqueService.criarEstoque(dados);
        ResultadoDTO resposta = new ResultadoDTO();
        
        if(retorno){
            
         resposta.setMessage("Sucesso ao Criar");
         
        return ResponseEntity.ok().body(resposta);
        }
        else {
             resposta.setMessage("Erro ao Criar");
             return ResponseEntity.badRequest().body(resposta);

        }
    }

     @PutMapping("/atualizar")
    public ResponseEntity<ResultadoDTO> atualizarEstoque(@RequestBody ControleDTO dados) {

        ResultadoDTO resposta = new ResultadoDTO();

        boolean retorno = estoqueService.atualizarEstoque(dados);
        if (retorno) {
            resposta.setMessage("Sucesso ao atualizar");
            return ResponseEntity.ok(resposta);
        } else {
            resposta.setMessage("Erro ao atualizar");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resposta);
        }
    }
    
    @GetMapping("/obter")
    public ResponseEntity<ArrayList<ControleDTO>> obter(){
        return ResponseEntity.ok().body(estoqueService.obter());
    }
}
