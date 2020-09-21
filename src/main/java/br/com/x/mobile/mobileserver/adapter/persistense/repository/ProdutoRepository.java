package br.com.x.mobile.mobileserver.adapter.persistense.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.x.mobile.mobileserver.adapter.persistense.entity.ProdutoEntity;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

	List<ProdutoEntity> findByLojaAndGtin(Integer loja, Long gtin);

}
