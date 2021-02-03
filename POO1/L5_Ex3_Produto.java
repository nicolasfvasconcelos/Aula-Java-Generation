package Turma15_POO;

public class L5_Ex3_Produto {
	
	//Criando atributos
	
	public String nome;
	public String cor;
	public double preco;
	
	
	
	
	
	//Metodo construtor (Gerado pelo Sistema)
	
	public L5_Ex3_Produto(String nome, String cor, double preco, double desconto) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		
	}

	public String getProduto() 
	{
		String produto = ("meu produto é uma "+nome+" da cor "+cor+" cujo o preço é R$ " + preco); 
		return produto;
	}

	//Metodo (get e set)
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

}
