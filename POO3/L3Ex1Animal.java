package Turma15_POO3;

public abstract class L3Ex1Animal {
	//atributos de animal
	protected String nome;
	protected int idade;
	//metodos de animal
	public abstract void som();
	public abstract void locomocao();
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	

}
