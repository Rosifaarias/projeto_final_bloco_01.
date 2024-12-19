package LojaDeRoupas;

import java.util.Scanner;

import loja.util.Cores;



public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		do {
			System.out.println(Cores.TEXT_WHITE_BOLD +  Cores.ANSI_BLACK_BACKGROUND +"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                LOJA DE ROUPAS ROSE PRIVÉE            ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Buscar Produto por Nome              ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Remover Produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.print("Entre com a opção desejada:                          ");

			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_RED_BOLD + "\nCadastrar Produto\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_RED_BOLD + "\nListar Produtos\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_RED_BOLD + "\nBuscar Produto por Nome\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_PURPLE_BOLD +"\nAtualizar Produto\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_RED_BOLD + "\nRemover Produto\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_RED_BOLD +"\nLoja de Roupas Fashion - A moda ao seu alcance!");
				sobre();
				leia.close();
				System.exit(0);
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				break;
			}
		} while (opcao != 6);

	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por Rosilene Farias: ");
		System.out.println(" ROSE PRIVÉE - rosilene.farias00@gmail.com");
		System.out.println("https://github.com/Rosifaarias/projeto_final_bloco_01.");
		System.out.println("*********************************************************");
	}

}
