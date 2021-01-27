package Turma15;

import java.util.Scanner;

public class Ex5L1 {
	public static void main (String Args []) 
	{
		float n1, n2, n3, mp;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva sua primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Escreva sua segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Escreva sua terceira nota: ");
		n3 = ler.nextFloat();
		
		mp = (n1*2 + n2*3 + n3*5)/10;
		
		System.out.println("A Media é: " + mp);
		
		
	}

}
