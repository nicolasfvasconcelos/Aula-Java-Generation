package Turma15;

import java.util.Scanner;

public class Ex2L1 {

	public static void main(String args []) 
	{
		int ano, mes, dia, resto, vida;
		
		Scanner ler =  new Scanner (System.in);
		System.out.println("Digite a sua idade (em dias): ");
		vida = ler.nextInt();
		ano = vida/365;
		resto = vida%365;
		mes = resto/30;
		dia = ((vida%365)%30);
				
		System.out.println("Sua idade é de: "+ ano +" ano(s), " + mes +", mês(es) e " + dia +" dia(s)");
				
	}
}
