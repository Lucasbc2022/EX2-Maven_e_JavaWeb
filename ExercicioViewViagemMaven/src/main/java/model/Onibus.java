package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Onibus {
	
	private int codigo_viagem;
	private String nome_mot;
	private String placa;
	private String marca;
	private int ano;
	private String descricao;
	
}
