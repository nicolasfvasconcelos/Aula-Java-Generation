package Turma15_POO;

import java.util.Scanner;

public class L5_Ex2_Aviao_Main {
public static void main(String args [])
{
	Scanner ler = new Scanner(System.in);
	String n, e, d;
	int p;

	System.out.println("Ola, usuário! \nQual seu nome? ");
	//ler.nextLine();
	n = ler.nextLine();
	
	System.out.println("Qual a empresa que você gostaria de viajar? ");
	//ler.nextLine();
	e = ler.nextLine();
	
	System.out.println("Qual o destino da sua felicidade? ");
	//ler.nextLine();
	d = ler.nextLine();
	
	System.out.println("Quantas passagens para felicidade você gostaria? ");
	p = ler.nextInt();
	
	L5_Ex2_Aviao viagem = new L5_Ex2_Aviao(n, e, d, p);
	
	viagem.setPassageiro(n);
	viagem.setEmpresa(e);
	viagem.setDestino(d);
	viagem.setQtdPassagem(p);
	
	System.out.println("**********************************************************************************\n");
	System.out.println("Queride, "+ viagem.getPassageiro() + "\nSua viagem com destino à "+viagem.getDestino()+ " voando pelas asas da empresa "+ viagem.getEmpresa() + " foi registrada com sucesso!!! \nQuantidade de Passagens: "+viagem.getQtdPassagem());
}
}
