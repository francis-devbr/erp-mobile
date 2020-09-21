package br.com.x.mobile.mobileserver.adapter.web.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

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
public class ProdutoDTO {

	private Integer loja;
	private Long gtin;
	private String descricao;
	private Float precoCusto;
	private Float precoVenda;
	private Float estoque;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime dtUltimaCompra;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
