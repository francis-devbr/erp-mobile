package br.com.x.mobile.mobileserver.adapter.mapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.x.mobile.mobileserver.adapter.persistense.entity.ProdutoEntity;
import br.com.x.mobile.mobileserver.adapter.web.dto.ProdutoDTO;
import br.com.x.mobile.mobileserver.domain.entity.Produto;

public class ProdutoMapper {

    private ProdutoMapper() {
	throw new IllegalStateException("Static Mapper class");
    }

    public static ProdutoDTO mapToWebDTO(Produto prod) {
	return Optional.ofNullable(prod)
		.map(x -> ProdutoDTO
			.builder()
			.descricao(x.getDescricao())
			.dtEntrega(x.getDtEntrega())
			.dtUltimaCompra(x.getDtUltimaCompra())
			.dtUltimaVenda(x.getDtUltimaVenda())
			.estoque(x.getEstoque())
			.gtin(x.getGtin())
			.loja(x.getLoja())
			.perPromocao(x.getPerPromocao())
			.precoCusto(x.getPrecoCusto())
			.precoVenda(x.getPrecoVenda())
			.qtdPedido(x.getQtdPedido())
			.qtdVenda(x.getQtdVenda())
			.qtdVenda15(x.getQtdVenda15())
			.qtdVenda30(x.getQtdVenda30())
			.valVendaDia(x.getValVendaDia())
			.valVenda15dias(x.getValVenda15dias())
			.valVenda30dias(x.getValVenda30dias())
			.build())
		.orElse(null);
    }

    public static Produto mapToDomainEntity(ProdutoEntity prod) {
    	return Optional.ofNullable(prod)
    			.map(x -> Produto
    				.builder()
    				.descricao(x.getDescricao())
    				.dtEntrega(x.getDtEntrega())
    				.dtUltimaCompra(x.getDtUltimaCompra())
    				.dtUltimaVenda(x.getDtUltimaVenda())
    				.estoque(x.getEstoque())
    				.gtin(x.getGtin())
    				.loja(x.getLoja())
    				.perPromocao(x.getPerPromocao())
    				.precoCusto(x.getPrecoCusto())
    				.precoVenda(x.getPrecoVenda())
    				.qtdPedido(x.getQtdPedido())
    				.qtdVenda(x.getQtdVenda())
    				.qtdVenda15(x.getQtdVenda15())
    				.qtdVenda30(x.getQtdVenda30())
    				.valVendaDia(x.getValVendaDia())
    				.valVenda15dias(x.getValVenda15dias())
    				.valVenda30dias(x.getValVenda30dias())
    				.build())
    			.orElse(null);
    }

    public static List<Produto> mapToDomainEntity(List<ProdutoEntity> produtos) {
	return produtos.stream().map(ProdutoMapper::mapToDomainEntity).collect(Collectors.toList());
    }

    public static List<ProdutoDTO> mapToWebDTO(List<Produto> produtos) {
	return produtos.stream().map(ProdutoMapper::mapToWebDTO).collect(Collectors.toList());
    }

}
