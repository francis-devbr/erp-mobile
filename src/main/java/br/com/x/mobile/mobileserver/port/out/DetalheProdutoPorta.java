package br.com.x.mobile.mobileserver.port.out;

import java.util.List;

import br.com.x.mobile.mobileserver.domain.entity.Produto;

public interface DetalheProdutoPorta {
	
	List<Produto> findByLojaAndGtin(int loja, long gtin);
	
	
}