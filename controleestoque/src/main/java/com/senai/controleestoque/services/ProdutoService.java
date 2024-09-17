package com.senai.controleestoque.services;

import com.senai.controleestoque.dtos.*;
import com.senai.controleestoque.models.*;
import java.util.ArrayList;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    ArrayList<ProdutoModel> listaProduto = new ArrayList<>();

    public boolean criarProdutos(ProdutoDTO dados) {
        ProdutoModel produto = new ProdutoModel();

        for (var item : listaProduto) {
            if (Objects.equals(item.getId(), dados.getId())) {
                return false;
            }

        }

        produto.setDescricao(dados.getDescricao());
        produto.setNome(dados.getNome());
        produto.setId(dados.getId());

        listaProduto.add(produto);

        return true;
    }
    
    public boolean atualizarProdutos(ProdutoDTO dados){
        ProdutoModel produto = new ProdutoModel();
        
        for(ProdutoModel item : listaProduto){
            if(item.getId().equals(dados.getId())){
                produto.setDescricao(dados.getDescricao());
                produto.setNome(dados.getNome());
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<ProdutoDTO> obter(){
        
        ArrayList<ProdutoDTO> lista = new ArrayList();
        
        for(ProdutoModel item : listaProduto){
            
            ProdutoDTO produto = new ProdutoDTO();
            
            produto.setId(item.getId());
            produto.setNome(item.getNome());
            produto.setDescricao(item.getDescricao());
            
            lista.add(produto);
        }
        return lista;
    }
}
