package Turma15;

import java.util.Scanner;

public class ProjetoReciclaBemNaWeb {
	public static void main(String args[]) {
		String nome, endereco, comentario, anonima, denuncia, dia1 = "0", hora = "0", email;
		int opcao, op, resposta, dia, horario;

		Scanner ler = new Scanner(System.in);

		System.out.println("Beeem vinde, queride Usuário! \nVamos fazer seu cadastro???");
		System.out.println("Vamos começaar! \nQual seu nome? \n");
		nome = ler.nextLine();
		System.out.println("");

		System.out.println("\nAgora digite seu endereço (Rua/Avenida - Número - CEP - Estado - UF) ");
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
					"\nSelecione o tipo de lixo:\n(1) - Eletrônico\n(2) - Orgânico\n(3) - Reciclável (no geral)\n(4) - Outros");
			op = ler.nextInt();
			if (op == 1) {
				System.out.println(
						"Qual dia da semana é melhor para você: \n(1) - Segunda-feira \n(2) - Quarta-feira \n(3) - Sexta-Feira");
				dia = ler.nextInt();
				if (dia == 1) {
					dia1 = "Segunda-Feira";
				} else if (dia == 2) {
					dia1 = "Quarta-Feira";
				} else if (dia == 3) {
					dia1 = "Sexta-Feira";
				}
				System.out.println("\nQual horário de sua preferência? \n(1) - 18:00 às 20:00 \n(2) - 20:00 às 22:00");
				horario = ler.nextInt();

				if (horario == 1) {
					hora = "18:00 às 20:00";
				} else if (horario == 2) {
					hora = "20:00 às 22:00";
				}

				System.out.println("Obrigado pela sua preferência! Estaremos enviando a coleta na " + dia1
						+ " no período das " + hora + " horas.");
			}

			if (op == 2) {
				System.out.println(
						"Qual dia da semana é melhor para você: \n(1) - Segunda-feira \n(2) - Quarta-feira \n(3) - Sexta-Feira");
				dia = ler.nextInt();
				if (dia == 1) {
					dia1 = "segunda-feira";
				} else if (dia == 2) {
					dia1 = "quarta-feira";
				} else if (dia == 3) {
					dia1 = "sexta-feira";
				}
				System.out.println("\nQual horário de sua preferência? \n(1) - 18:00 às 20:00 \n(2) - 20:00 às 22:00");
				horario = ler.nextInt();

				if (horario == 1) {
					hora = "18:00 às 20:00";
				} else if (horario == 2) {
					hora = "20:00 às 22:00";
				}

				System.out.println("Obrigado pela sua preferência! Estaremos enviando a coleta na " + dia1
						+ " no período das " + hora + " horas.");
			}
			if (op == 3) {
				System.out.println(
						"Qual dia da semana é melhor para você: \n(1) - Segunda-feira \n(2) - Quarta-feira \n(3) - Sexta-Feira");
				dia = ler.nextInt();
				if (dia == 1) {
					dia1 = "segunda-feira";
				} else if (dia == 2) {
					dia1 = "quarta-feira";
				} else if (dia == 3) {
					dia1 = "sexta-feira";
				}
				System.out.println("\nQual horário de sua preferência? \n(1) - 18:00 às 20:00 \n(2) - 20:00 às 22:00");
				horario = ler.nextInt();

				if (horario == 1) {
					hora = "18:00 às 20:00";
				} else if (horario == 2) {
					hora = "20:00 às 22:00";
				}

				System.out.println("Obrigado pela sua preferência! Estaremos enviando a coleta na " + dia1
						+ " no período das " + hora + " horas.");
			}
			if (op == 4) {
				System.out.println(
						"Qual dia da semana é melhor para você: \n(1) - Segunda-feira \n(2) - Quarta-feira \n(3) - Sexta-Feira");
				dia = ler.nextInt();
				if (dia == 1) {
					dia1 = "segunda-feira";
				} else if (dia == 2) {
					dia1 = "quarta-feira";
				} else if (dia == 3) {
					dia1 = "sexta-feira";
				}
				System.out.println("\nQual horário de sua preferência? \n(1) - 18:00 às 20:00 \n(2) - 20:00 às 22:00");
				horario = ler.nextInt();

				if (horario == 1) {
					hora = "18:00 às 20:00";
				} else if (horario == 2) {
					hora = "20:00 às 22:00";
				}

				System.out.println("Obrigado pela sua preferência! Estaremos enviando a coleta na " + dia1
						+ " no período das " + hora + " horas.");
			}
			System.out.println("Uma cópia das informações foram enviadas para seu e-mail:" + email);
			break;

		case 2:

			System.out.println("Digite o endereço da denuncia: (Rua/Avenida - Número - CEP - Estado - UF)");
			ler.nextLine();
			denuncia = ler.nextLine();

			System.out.println("");

			System.out.println(
					"Por favor, diga o tipo de resíduo: \n(1) - Eletrônico \n(2) - Químico \n(3) - Biológico \n(4) - Entulho \n(5) - Outros");

			op = ler.nextInt();
			System.out.println("");

			System.out.println("Caso ache necessário, descreva a situação: ");
			ler.nextLine();
			comentario = ler.nextLine();
			System.out.println("");
			System.out.println("Gostaria que sua denuncia seja feita de forma anônima? \nDigite sim ou não: ");
			anonima = ler.nextLine();

			System.out.println(
					"Muito obrigado pela sua contribuição! Sua denuncia foi registrada!\nE resolveremos seu problema junto de sua Prefeitura local em até 3 dias úteis.\nPara mais informações entre em contato:\nWhatsApp (11)9999-9999\nTelefone (11)7070-7070 (se não der certo 70 DE NOVO).\nEndereço da denuncia: "
							+ denuncia + "\nTipo de resíduo: (" + op + ") \nComentário: " + comentario
							+ "\nDenuncia anônima: " + anonima);
			System.out.println("Uma cópia das informações foram enviadas para seu e-mail:" + email);

			break;
			default:
				System.out.println("Opção inválida!!!!Tente novamente.");
			break;

		}
		System.out.println("");
		System.out.println("Aeeeee Rodouuuuuu uhulll!!!");
		System.out.println("");
		System.out.println("Desenvolvedores deste projeto:\nBeatriz Oliveira.\nBruna Soares.\nCaroline Miranda.\nLucas S. Pereira.\nNicolas F. Vasconcelos");
		
	}

}