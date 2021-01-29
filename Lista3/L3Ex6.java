package Turma15;

import java.util.Scanner;

public class L3Ex6 {
	public static void main(String args []) 
	{
		int numero, cont=0, soma=0;
		float media;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Entre com seu número: ");
		do 
		{
			numero = ler.nextInt();
			if(numero%3 == 0 && numero!=0) 
			{
				soma = soma +numero;
				cont = cont + 1;
			}
			
		}
		while(numero != 0);
		if (cont != 0) {
		media = soma/(cont);
	
		
		System.out.println("\n Numerador: " + soma);
		System.out.println("\n Denominador : "+ cont);
		System.out.printf("\n Media : %5.2f", media);
		}
		else if (cont == 0) 
		{
			System.out.println("Fim");
		}
		
	}

}
