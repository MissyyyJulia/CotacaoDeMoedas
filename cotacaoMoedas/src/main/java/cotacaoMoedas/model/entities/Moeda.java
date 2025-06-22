package cotacaoMoedas.model.entities;

public class Moeda {

	private String codigo_moeda;
	
	public Moeda () {}
	
	public Moeda (String codigo_moeda) {
		this.codigo_moeda = codigo_moeda.toUpperCase(); //padronizar pra que fique tudo em maiúsculo
	}
	
	public String getCodigomoeda() {
		return codigo_moeda;
	}
	
	public void setCodigoMoeda(String codigo_moeda) {
		this.codigo_moeda = codigo_moeda.toUpperCase();
	}
}
