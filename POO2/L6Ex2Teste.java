package Turma15_POO2;

import java.util.Scanner;

public class L6Ex2Teste {
	public static void main(String args []) 
	{
		//L6Ex2Fornecedor fornecedor1 = new L6Ex2Fornecedor("Nicolas",24,"Rua do Tô Surtado","4002-8922",2500.50,1350.00);
		Scanner ler = new Scanner(System.in);
		String n,e,t;
		int i;
		float c,d;
		
		System.out.println("Vamos cadastrar suas informações? ");
		System.out.println("Nome: ");
		n = ler.nextLine();
		System.out.println("Idade: ");
		i = ler.nextInt();
		System.out.println("Endereço: ");
		ler.nextLine();
		e = ler.nextLine();
		System.out.println("Telefone: ");
		//ler.nextLine();
		t = ler.nextLine();
		System.out.println("Credito: ");
		c = ler.nextFloat();
		System.out.println("Dívida: ");
		d = ler.nextFloat();
		
		
		//L6Ex1Pessoa fornecedor2 = new L6Ex1Pessoa(n,t,e,i);
		L6Ex2Fornecedor fornecedor1 = new L6Ex2Fornecedor(n,i,e,t,c,d);

		fornecedor1.setNome(n);
		fornecedor1.setIdade(i);
		fornecedor1.setEndereco(e);
		fornecedor1.setTelefone(t);
		fornecedor1.setValorCredito(c);
		fornecedor1.setValorDivida(d);		
		
		
	
		System.out.println("------------------------\n");
		System.out.println("Caro, " +fornecedor1.getNome()+ "\n");
		System.out.println("********CADASTRO********");
		System.out.println("NOME: " + fornecedor1.getNome());
		System.out.println("IDADE: " + fornecedor1.getIdade() +" anos");
		System.out.println("RESIDENCIA: " + fornecedor1.getEndereco());
		System.out.println("TELEFONE: " + fornecedor1.getTelefone());
		System.out.println("SALDO: R$" ); fornecedor1.obterSaldo();
		//System.out.println("Saldo:" + (fornecedor1.getValorCredito() - fornecedor1.getValorDivida()));
		System.out.println("------------------------\n");





	}

}
