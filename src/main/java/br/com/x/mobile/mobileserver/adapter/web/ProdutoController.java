package br.com.x.mobile.mobileserver.adapter.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.x.mobile.mobileserver.adapter.mapper.ProdutoMapper;
import br.com.x.mobile.mobileserver.adapter.web.dto.ProdutoDTO;
import br.com.x.mobile.mobileserver.domain.entity.Produto;
import br.com.x.mobile.mobileserver.port.in.DetalheProdutoService;;

@RestController
@RequestMapping({ "/api/produto/{loja}/{gtin}" })
public class ProdutoController {
	
	@Autowired
	private DetalheProdutoService detalheProdutoService;

    @GetMapping()
    public ProdutoDTO obterProdutos(@PathVariable("loja") int loja,@PathVariable("gtin") long gtin) {
    	
		List<Produto> produto = detalheProdutoService.BuscarProduto(loja, gtin);
		if (produto.isEmpty()) {
			throw new ResponseStatusException( HttpStatus.NOT_FOUND, "Produto não foi encontrado");
		}else {
			return ProdutoMapper.mapToWebDTO(produto).get(0);
		}
		
		
    }
	    
}
