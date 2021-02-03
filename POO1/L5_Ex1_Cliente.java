package Turma15_POO;

public class L5_Ex1_Cliente {
	// Criando meus atributos
	private String nomePrimeiro;
	private String nomeMeio;
	private String nomeFinal;
	private int idade;
	private double altura;
	// Criando um contrutor
	
	public L5_Ex1_Cliente (String primeiro, String meio , String ultimo, int veroesVividos, double tamanho)
	{
	
	nomePrimeiro = primeiro;
	nomeMeio = meio;
	nomeFinal = ultimo;
	idade = veroesVividos;
	altura = tamanho;
	
	}
	
	public String getNomeCompleto() 
	{
		String nomeCompleto =("O cliente mais fiel da loja é: " + nomePrimeiro +" "+nomeMeio+" e "+nomeFinal+ " da Silva. \nSua idade é: "+ idade+ " anos \nSua altura é: " + altura + " metros... \nOU SEJA, TAMPINHA!!!");
		
		return nomeCompleto;
		
	}
}
