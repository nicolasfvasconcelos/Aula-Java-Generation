package Turma15;

import java.util.Scanner;

public interface Ex6L1 {
	public static void main(String args [])
	{
		double x1, x2, y1, y2, d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de X1: ");
		x1 = ler.nextDouble();
		System.out.println("Digite o valor de Y1: ");
		y1 = ler.nextDouble();
		System.out.println("Digite o valor de X2: ");
		x2 = ler.nextDouble();
		System.out.println("Digite o valor de Y2: ");
		y2 = ler.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		System.out.println("A dist�ncia �: " + d);
	
		
		
		
		
	}

}
