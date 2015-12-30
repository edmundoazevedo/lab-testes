package laboratorio;

import org.apache.commons.lang3.Validate;

public class Aluno {
	private String nome;
	
	public Aluno() {
	}

	public Aluno(String nome) {
		Validate.notNull(nome);
		Validate.notEmpty(nome);
		Validate.notBlank(nome);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
