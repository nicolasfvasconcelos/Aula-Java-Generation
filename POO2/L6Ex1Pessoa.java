package Turma15_POO2;

public class L6Ex1Pessoa {
	// 1--> Criando ATRIBUTOS
	
	private String nome;
	private String endereco;
	private String telefone;
	private int idade;
	
	//2--> Criando CONSTRUTOR (padrão)
	
	public L6Ex1Pessoa (String nome, String endereco, String telefone, int idade) 
	{
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//3-->getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	
	//4--> Metodo Imprimir -- imprime informações
	// modificador void (sem retorno) nome(Sem parametros)
	
	public void imprimirInfo() 
	{
		System.out.println("----------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("----------------------------------");
	
	}
	
	


	
	

}
