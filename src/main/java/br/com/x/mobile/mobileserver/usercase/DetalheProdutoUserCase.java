package br.com.x.mobile.mobileserver.usercase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.x.mobile.mobileserver.domain.entity.Produto;
import br.com.x.mobile.mobileserver.port.in.DetalheProdutoService;
import br.com.x.mobile.mobileserver.port.out.DetalheProdutoPorta;

@Component
public class DetalheProdutoUserCase implements DetalheProdutoService {
	
	@Autowired
	DetalheProdutoPorta detalheProdutoPorta;

	@Override
	public List<Produto> BuscarProduto(int loja, long gtin) {
		
		return detalheProdutoPorta.findByLojaAndGtin(loja, gtin);
		
	}
	
}