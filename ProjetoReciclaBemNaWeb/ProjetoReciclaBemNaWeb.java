package Turma15;

import java.util.Scanner;

public class ProjetoReciclaBemNaWeb {
	public static void main(String args[]) {
		String nome, endereco, comentario, anonima, denuncia, dia1 = "0", hora = "0", email;
		int opcao, op, resposta, dia, horario;

		Scanner ler = new Scanner(System.in);

		System.out.println("Beeem vinde, queride Usu�rio! \nVamos fazer seu cadastro???");
		System.out.println("Vamos come�aar! \nQual seu nome? \n");
		nome = ler.nextLine();
		System.out.println("");

		System.out.println("\nAgora digite seu endere�o (Rua/Avenida - N�mero - CEP - Estado - UF) ");
		endereco = ler.nextLine();
		System.out.println("");

		System.out.println("\nAgora digite seu e-mail:");
		email = ler.nextLine();
		System.out.println("");

		System.out.println(nome
				+ "\nEscolha o que deseja fazer:\n(1) - Descartar meu lixo;\n(2) - Denunciar um descarte incorreto; ");
		opcao = ler.nextInt();
		System.out.println("");

		switch (opcao) {

		case 1:

			System.out.println(
					"\nSelecione o tipo de lixo:\n(1) - Eletr�nico\n(2) - Org�nico\n(3) - Recicl�vel (no geral)\n(4) - Outros");
			op = ler.nextInt();
			if (op == 1) {
				System.out.println(
						"Qual dia da semana � melhor para voc�: \n(1) - Segunda-feira \n(2) - Quarta-feira \n(3) - Sexta-Feira");
				dia = ler.nextInt();
				if (dia == 1) {
					dia1 = "Segunda-Feira";
				} else if (dia == 2) {
					dia1 = "Quarta-Feira";
				} else if (dia == 3) {
					dia1 = "Sexta-Feira";
				}
				System.out.println("\nQual hor�rio de sua prefer�ncia? \n(1) - 18:00 �s 20:00 \n(2) - 20:00 �s 22:00");
				horario = ler.nextInt();

				if (horario == 1) {
					hora = "18:00 �s 20:00";
				} else if (horario == 2) {
					hora = "20:00 �s 22:00";
				}

				System.out.println("Obrigado pela sua prefer�ncia! Estaremos enviando a coleta na " + dia1
						+ " no per�odo das " + hora + " horas.");
			}

			if (op == 2) {
				System.out.println(
						"Qual dia da semana � melhor para voc�: \n(1) - Segunda-feira \n(2) - Quarta-feira \n(3) - Sexta-Feira");
				dia = ler.nextInt();
				if (dia == 1) {
					dia1 = "segunda-feira";
				} else if (dia == 2) {
					dia1 = "quarta-feira";
				} else if (dia == 3) {
					dia1 = "sexta-feira";
				}
				System.out.println("\nQual hor�rio de sua prefer�ncia? \n(1) - 18:00 �s 20:00 \n(2) - 20:00 �s 22:00");
				horario = ler.nextInt();

				if (horario == 1) {
					hora = "18:00 �s 20:00";
				} else if (horario == 2) {
					hora = "20:00 �s 22:00";
				}

				System.out.println("Obrigado pela sua prefer�ncia! Estaremos enviando a coleta na " + dia1
						+ " no per�odo das " + hora + " horas.");
			}
			if (op == 3) {
				System.out.println(
						"Qual dia da semana � melhor para voc�: \n(1) - Segunda-feira \n(2) - Quarta-feira \n(3) - Sexta-Feira");
				dia = ler.nextInt();
				if (dia == 1) {
					dia1 = "segunda-feira";
				} else if (dia == 2) {
					dia1 = "quarta-feira";
				} else if (dia == 3) {
					dia1 = "sexta-feira";
				}
				System.out.println("\nQual hor�rio de sua prefer�ncia? \n(1) - 18:00 �s 20:00 \n(2) - 20:00 �s 22:00");
				horario = ler.nextInt();

				if (horario == 1) {
					hora = "18:00 �s 20:00";
				} else if (horario == 2) {
					hora = "20:00 �s 22:00";
				}

				System.out.println("Obrigado pela sua prefer�ncia! Estaremos enviando a coleta na " + dia1
						+ " no per�odo das " + hora + " horas.");
			}
			if (op == 4) {
				System.out.println(
						"Qual dia da semana � melhor para voc�: \n(1) - Segunda-feira \n(2) - Quarta-feira \n(3) - Sexta-Feira");
				dia = ler.nextInt();
				if (dia == 1) {
					dia1 = "segunda-feira";
				} else if (dia == 2) {
					dia1 = "quarta-feira";
				} else if (dia == 3) {
					dia1 = "sexta-feira";
				}
				System.out.println("\nQual hor�rio de sua prefer�ncia? \n(1) - 18:00 �s 20:00 \n(2) - 20:00 �s 22:00");
				horario = ler.nextInt();

				if (horario == 1) {
					hora = "18:00 �s 20:00";
				} else if (horario == 2) {
					hora = "20:00 �s 22:00";
				}

				System.out.println("Obrigado pela sua prefer�ncia! Estaremos enviando a coleta na " + dia1
						+ " no per�odo das " + hora + " horas.");
			}
			System.out.println("Uma c�pia das informa��es foram enviadas para seu e-mail:" + email);
			break;

		case 2:

			System.out.println("Digite o endere�o da denuncia: (Rua/Avenida - N�mero - CEP - Estado - UF)");
			ler.nextLine();
			denuncia = ler.nextLine();

			System.out.println("");

			System.out.println(
					"Por favor, diga o tipo de res�duo: \n(1) - Eletr�nico \n(2) - Qu�mico \n(3) - Biol�gico \n(4) - Entulho \n(5) - Outros");

			op = ler.nextInt();
			System.out.println("");

			System.out.println("Caso ache necess�rio, descreva a situa��o: ");
			ler.nextLine();
			comentario = ler.nextLine();
			System.out.println("");
			System.out.println("Gostaria que sua denuncia seja feita de forma an�nima? \nDigite sim ou n�o: ");
			anonima = ler.nextLine();

			System.out.println(
					"Muito obrigado pela sua contribui��o! Sua denuncia foi registrada!\nE resolveremos seu problema junto de sua Prefeitura local em at� 3 dias �teis.\nPara mais informa��es entre em contato:\nWhatsApp (11)9999-9999\nTelefone (11)7070-7070 (se n�o der certo 70 DE NOVO).\nEndere�o da denuncia: "
							+ denuncia + "\nTipo de res�duo: (" + op + ") \nComent�rio: " + comentario
							+ "\nDenuncia an�nima: " + anonima);
			System.out.println("Uma c�pia das informa��es foram enviadas para seu e-mail:" + email);

			break;
			default:
				System.out.println("Op��o inv�lida!!!!Tente novamente.");
			break;

		}
		System.out.println("");
		System.out.println("Aeeeee Rodouuuuuu uhulll!!!");
		System.out.println("");
		System.out.println("Desenvolvedores deste projeto:\nBeatriz Oliveira.\nBruna Soares.\nCaroline Miranda.\nLucas S. Pereira.\nNicolas F. Vasconcelos");
		
	}

}