package aprendizado;

public class Produto {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.setAno(2005);
		c.setCor(Cor.AMARELO);
		
		System.out.println("O valor do meu carro é = " + c.getCor().getValor());
				if (c.getCor().getValor() > 3) { 
					System.out.println("Cor estravagante !!!");
				} else {
					System.out.println("Cor ofuscada !!!");
				}
	}

}
