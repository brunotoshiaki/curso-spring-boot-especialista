package com.example.produtosapi.controller;

import com.example.produtosapi.model.Produto;
import com.example.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("produtos")

public class ProdutoController {

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    private final ProdutoRepository produtoRepository;

    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto) {
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obeterPorId(@PathVariable("id") String  id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

   @PutMapping("{id}")
    public void atualizarProduto(@PathVariable("id")String id,
                                 @RequestBody Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);
   }

    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome){
        return produtoRepository.findByNome(nome);
    }
}
