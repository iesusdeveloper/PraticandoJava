package cursojava.iesus;

public class Pessoa {
	private String nome;
	
	private String sobrenome;
	
	private int idade;
	
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
