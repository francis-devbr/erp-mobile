package br.com.x.mobile.mobileserver.domain.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode
public class Produto {

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
