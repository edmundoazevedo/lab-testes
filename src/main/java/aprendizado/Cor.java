package aprendizado;

public enum Cor {
	
	AMARELO(4),
	AZUL(1),
	PRETO(2),
	PRATA(3),	
	VERMELHO(5),
	VERDE(6);
	
	private int valor;
	
	Cor (int i) {
		this.valor = i;		
	}

	public int getValor() {
		return valor;
	}
}
