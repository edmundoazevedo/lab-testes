package laboratorio;

import org.junit.Assert;
import org.junit.Test;

public class CalculoTest {
	
	@Test
	public void testExecutaSoma() {
		double PassaValor1 = 10.8;
		double PassaValor2 = 23.5;
		double RetornoEsperado = 34.3;
		
		double RetornoFeito = Calculo.ExecutaCalculoSoma(PassaValor1, PassaValor2);
		Assert.assertEquals(RetornoEsperado,RetornoFeito,0);
	}
	
	@Test
	public void testExecutaMultiplicacao() {
		double PassaValor1 = 10.876543;
		double PassaValor2 = 23.543210;
		double RetornoEsperado = 256.06873592303;
		
		double RetornoFeito = Calculo.ExecutaCalculoMultiplicacao(PassaValor1, PassaValor2);
		Assert.assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
	
	@Test
	public void testExecutaSubtracao() {
		double PassaValor1 = 23.543210;
		double PassaValor2 = 10.876543;
		double RetornoEsperado = 12.666666999999999;
		//double RetornoEsperado = 12.666667;
		
		double RetornoFeito = Calculo.ExecutaCalculoSubtracao(PassaValor1, PassaValor2);
		Assert.assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
	
	@Test
	public void testExecutaDivisao() {
		double PassaValor1 = 10.876543;
		double PassaValor2 = 23.543210;
		double RetornoEsperado = 0.4619821596120495;
		
		double RetornoFeito = Calculo.ExecutaCalculoDivisao(PassaValor1, PassaValor2);
		Assert.assertEquals(RetornoEsperado, RetornoFeito, 0);
	}
}

