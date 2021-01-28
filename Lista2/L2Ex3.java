package Turma15;

import java.util.Scanner;

public class L2Ex3 {
public static void main(String args [])
	{
		int idade;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite sua idade para saber sua categoria: ");
		idade = ler.nextInt();
		if( idade <= 14 && idade >=10 )
		{
			System.out.println("\n De acordo com sua idade, sua categoria é INFANTIL!");
		}
		else if(idade >=15 && idade <= 17)
		{
			System.out.println("\n De acordo com sua idade, sua categoria é JUVENIL!!");	
		}
		else if (idade >=18 && idade <= 25)
		{
			System.out.println("\n De acordo com sua idade, sua categoria é ADULTO!!!");
		}
		else 
		{
			System.out.println("\n Sua idade ainda não foi categorizada! Fale com o responsável!");
		}
	}
}
