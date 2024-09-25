package enumeracoes;

public enum Marcas {
	AMAZON ("Amazon"), DELL ("Dell"), HP ("HP"), TOSHIBA ("Toshiba"), LG ("LG"), 
	  SAMSUNG ("Samsung");
	
	private String descricao;
	private Marcas(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() { 
		return descricao;
	}
}

