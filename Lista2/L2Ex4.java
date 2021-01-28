package Turma15;

import java.util.Scanner;

public class L2Ex4 {
public static void main(String args [])
{
	double numero, raiz=0, potencia=0;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	numero = ler.nextDouble();
	
	if (numero % 2 ==0)
	{
		raiz =  Math.sqrt(numero);
		System.out.println("\n O numero " + numero + " é PAR!");
		System.out.println("\n Raiz: "+ raiz);
	}
	else 
	{
		potencia =  Math.pow(numero, 2);
		System.out.println("\n O numero " + numero + " é IMPAR!");
		System.out.println("\n Quadrado: "+ potencia);
	}

}
}
