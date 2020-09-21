package br.com.x.mobile.mobileserver.adapter.persistense.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuppressWarnings("unused")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Mobile_Produto")
@Entity
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public class ProdutoEntity {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer loja;
	private Long gtin;
	private String descricao;
	private Float precoCusto;
	private Float precoVenda;
	private Float estoque;
	private LocalDateTime dtUltimaCompra;
	private LocalDateTime dtUltimaVenda;
	private Float perPromocao;
	private Float qtdPedido;
	private LocalDateTime dtEntrega;
	private Float qtdVenda;
	private Float valVendaDia;
	private Float qtdVenda15;
	private Float valVenda15dias;
	private Float qtdVenda30;
	private Float valVenda30dias;
	
}
