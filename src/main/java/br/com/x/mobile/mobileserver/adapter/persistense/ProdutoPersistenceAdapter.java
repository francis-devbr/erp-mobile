package br.com.x.mobile.mobileserver.adapter.persistense;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.x.mobile.mobileserver.adapter.mapper.ProdutoMapper;
import br.com.x.mobile.mobileserver.adapter.persistense.repository.ProdutoRepository;
import br.com.x.mobile.mobileserver.domain.entity.Produto;
import br.com.x.mobile.mobileserver.port.out.DetalheProdutoPorta;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProdutoPersistenceAdapter implements DetalheProdutoPorta {

	private final ProdutoRepository produtoRepository;

	public List<Produto> findByLojaAndGtin(int loja, long gtin) {
		return ProdutoMapper.mapToDomainEntity(produtoRepository.findByLojaAndGtin(loja, gtin));
	}

}