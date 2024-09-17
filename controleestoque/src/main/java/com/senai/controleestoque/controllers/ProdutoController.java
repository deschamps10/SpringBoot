package com.senai.controleestoque.controllers;

import com.senai.controleestoque.dtos.*;
import com.senai.controleestoque.models.*;
import com.senai.controleestoque.services.*;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
@Validated
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/criar")
    public ResponseEntity<ResultadoDTO> createProduto(@RequestBody ProdutoDTO dados) {

        boolean retorno = produtoService.criarProdutos(dados);
        ResultadoDTO resposta = new ResultadoDTO();

        if (retorno) {
            resposta.setMessage("Sucesso ao Criar");
            return ResponseEntity.ok(resposta);
        } else {
            resposta.setMessage("Erro ao Criar");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resposta);
        }
    }

    @PutMapping("/atualizar")
    public ResponseEntity<ResultadoDTO> atualizarProduto(@RequestBody ProdutoDTO dados) {

        ResultadoDTO resposta = new ResultadoDTO();

        boolean retorno = produtoService.atualizarProdutos(dados);
        if (retorno) {
            resposta.setMessage("Sucesso ao atualizar");
            return ResponseEntity.ok(resposta);
        } else {
            resposta.setMessage("Erro ao atualizar");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resposta);
        }
    }
    
    @GetMapping("/obter")
    public ResponseEntity<ArrayList<ProdutoDTO>> obter(){
        return ResponseEntity.ok().body(produtoService.obter());
    }
}
