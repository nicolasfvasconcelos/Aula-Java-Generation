package Turma15;

import java.util.Scanner;

public class Ex1L1 {
	public static void main(String Args []) 
	{
		int ano, mes, dia, totalDeDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com sua idade (em anos): ");
		ano = ler.nextInt();
		System.out.println("Entre com sua idade(em meses): ");
		mes = ler.nextInt();
		System.out.println("Entre com sua idade (em dias): ");
		dia = ler.nextInt();
		
		ano = ano*365;
		mes = mes*30;
		totalDeDias = ano + mes + dia;
		
		System.out.println("Sua idade em dias é: " + totalDeDias);
		
	}

}
