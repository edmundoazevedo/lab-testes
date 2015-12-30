package laboratorio;

import org.junit.Assert;
import org.junit.Test;

public class AlunoTest {
	
	@Test
	public void testGetNome() {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Edmundo de Azevedo Batista");
		
		Assert.assertEquals("Edmundo de Azevedo Batista", aluno1.getNome());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetNomeVazio() {
		Aluno aluno1 = new Aluno();
		new Aluno("");		
		Assert.assertEquals("", aluno1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetNomeEmBranco() {
		Aluno aluno1 = new Aluno();
		new Aluno("  ");
		
		Assert.assertEquals("  ", aluno1);
	}

}
