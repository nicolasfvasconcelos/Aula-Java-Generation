package Turma15;

import java.util.Scanner;

public class AulaJava02Condicional2 {
 public static void main(String args []) 
 
 {
	 // Calculadora para treinar o caso
	 
	 float num1, num2, result=0;
	 char op;
	 
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Digite o primeiro número: ");
	 num1 = ler.nextFloat();
	 System.out.println("Digite o segundo número: ");
	 num2 = ler.nextFloat();
	 System.out.println(" \nQual operação você deseja realizar? \n(+) - SOMA \n(-) - SUBTRAÇÃO \n(*) - MULTIPLICAÇÃO \n(/) - DIVISÃO ");
	 op = ler.next().charAt(0);
	 // op=lernext É PARA LER O CARACTERES
	 // charAt() para ler a posição de um determinado valor digitado
	 // o zero foi pra ler apenas a primeira letra digitada
	 switch (op) 
	 {
	 case '+':
		 result = num1 + num2;		
		 break;
	
	 case '-':
		 result = num1-num2;
		 break;
		 
	 case '/':
		 result = num1/num2;
		 break;
		
	 case '*':
		 result = num1*num2;
		 break;
		 
		 default:
			 System.out.println("\nAlgo errado não está certo! Operação INVALIDA!!");
		 
	 }
	 System.out.println("\nO resultado da operação é: " + result);
	 System.out.printf("\nO resultado da OP é: %2.2f ", result);
	 
	 
	 
 }
}

