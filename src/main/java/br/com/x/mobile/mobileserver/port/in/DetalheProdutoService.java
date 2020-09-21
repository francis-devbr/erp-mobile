package br.com.x.mobile.mobileserver.port.in;

import java.util.List;

import br.com.x.mobile.mobileserver.domain.entity.Produto;

public interface DetalheProdutoService {
	
	List<Produto> BuscarProduto(int loja, long gtin);
	
	
}