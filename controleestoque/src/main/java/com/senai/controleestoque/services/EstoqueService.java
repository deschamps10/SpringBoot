package com.senai.controleestoque.services;

import com.senai.controleestoque.dtos.*;
import com.senai.controleestoque.models.EstoqueModel;
import com.senai.controleestoque.models.ProdutoModel;
import java.util.ArrayList;
import java.util.Objects;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstoqueService {

    ArrayList<EstoqueModel> listaEstoque = new ArrayList<EstoqueModel>();

    public boolean criarEstoque(ControleDTO dados) {

        EstoqueModel estoque = new EstoqueModel();

        for(var item : listaEstoque){
            if(Objects.equals(item.getId(), dados.getId())){
                
                return false;
            }
        }
        
        int quantidade = dados.getQuantidade();
        Long id = dados.getId();
        Long produto = dados.getIdProduto();

        estoque.setQuantidade(quantidade);
        estoque.setId(id);
        estoque.setIdProduto(produto);

        listaEstoque.add(estoque);

        return true;
    }
    
     public boolean atualizarEstoque(ControleDTO dados){
        EstoqueModel estoque = new EstoqueModel();
        
        for(EstoqueModel item : listaEstoque){
            if(item.getId().equals(dados.getId())){
                estoque.setId(dados.getId());
                estoque.setIdProduto(dados.getIdProduto());
                estoque.setQuantidade(dados.getQuantidade());
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<ControleDTO> obter(){
        
        ArrayList<ControleDTO> lista = new ArrayList();
        
        for(EstoqueModel item : listaEstoque){
            
            ControleDTO estoque = new ControleDTO();
            
            estoque.setId(item.getId());
            estoque.setIdProduto(item.getIdProduto());
            estoque.setQuantidade(item.getQuantidade());
            
            lista.add(estoque);
        }
        return lista;
    }

}
