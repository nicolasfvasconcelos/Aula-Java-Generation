package Turma15;

import java.util.Scanner;

public class AulaJava02Condicional2 {
 public static void main(String args []) 
 
 {
	 // Calculadora para treinar o caso
	 
	 float num1, num2, result=0;
	 char op;
	 
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Digite o primeiro n�mero: ");
	 num1 = ler.nextFloat();
	 System.out.println("Digite o segundo n�mero: ");
	 num2 = ler.nextFloat();
	 System.out.println(" \nQual opera��o voc� deseja realizar? \n(+) - SOMA \n(-) - SUBTRA��O \n(*) - MULTIPLICA��O \n(/) - DIVIS�O ");
	 op = ler.next().charAt(0);
	 // op=lernext � PARA LER O CARACTERES
	 // charAt() para ler a posi��o de um determinado valor digitado
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
			 System.out.println("\nAlgo errado n�o est� certo! Opera��o INVALIDA!!");
		 
	 }
	 System.out.println("\nO resultado da opera��o �: " + result);
	 System.out.printf("\nO resultado da OP �: %2.2f ", result);
	 
	 
	 
 }
}

