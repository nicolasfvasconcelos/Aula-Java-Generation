package Turma15;

import java.util.Scanner;

public class L3Ex5 {

	public static void main(String args []) 
	{
		float numero, soma=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com algum número: ");
		do 
		{
			numero = ler.nextFloat();
			soma = soma + numero;
		}
		
		while (numero != 0);
		
		//System.out.println(" A soma dos numeros digitados é: "+ soma);
		System.out.printf("SOMA: %5.2f ", soma);
		
	}
}
