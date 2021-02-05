package Turma15_POO2;
//1--> Fazer a heran�a utilizando o "extends" na subclasse "funcion�rio"
public class L6Ex2Fornecedor extends L6Ex1Pessoa {
	
	//2--> Colocar os atributos pr�prios de Funcion�rio
	private float valorCredito;
	private float valorDivida;
	
	//3 --> CONSTRUTOR
	//CONSTRUTOR S� COM OS ATRIBUTOS DE SUPER
	public L6Ex2Fornecedor( String nome, int idade, String endereco, String telefone) 
	{
		super(nome, telefone, endereco, idade);
	}
	
	//CONSTRUTOR COM SUPER E VALORES
	public L6Ex2Fornecedor( String nome, int idade, String endereco, String telefone, float valorCredito, float valorDivida)
	{
		super(nome, telefone, endereco, idade); //4--> Chamando atributos da ClasseSuper
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}	
	
	//5-->
	
	public void obterSaldo() 
	{
		//obterSaldo = valorCredito - valorDivida;
		System.out.println(valorCredito - valorDivida);
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	

}
