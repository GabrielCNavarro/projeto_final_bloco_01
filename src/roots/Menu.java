package roots;

import java.util.Scanner;

import roots.model.Organico;
import roots.model.Vegano;
import roots.util.Cores;


public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int option;
		
		
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
							 + "************************************************************************");
			System.out.println("*                     Bem vindos à Saboaria Roots!                     *");                            
			System.out.println("*                                                                      *");
			System.out.println("*         Roots a sua melhor escolha para sabonetes artesanais!        *");                        
			System.out.println("*                                                                      *");
			System.out.println("************************************************************************");
			System.out.println("*                                                                      *");
			System.out.println("*                     Selecione uma opção abaixo!                      *");
			System.out.println("*                                                                      *");
			System.out.println("************************************************************************");
			System.out.println("*                                                                      *");
			System.out.println("*       1 - Cadastrar Sabonete                                         *");
			System.out.println("*       2 - Listar todos os Sabonetes                                  *");
			System.out.println("*       3 - Consultar Sabonete por ID                                  *");
			System.out.println("*       4 - Atualizar Sabonete                                         *");
			System.out.println("*       5 - Apagar Sabonete                                            *");
			System.out.println("*                                                                      *");
			System.out.println("*       0 - Sair                                                       *");
			System.out.println("*                                                                      *");
			System.out.println("************************************************************************");
			System.out.println("* Entre com a opção desejada:                                          *");
			System.out.println("************************************************************************");
			option = leia.nextInt();
			System.out.println("*                                                                       *"+ Cores.TEXT_RESET);
			
			if (option == 0) {
				System.out.println( Cores.TEXT_WHITE_BOLD + "\n Obrigado pela preferência! Cuide-se com os produtos Roots!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (option) {
					case 1:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Cadastrar Sabonete \n\n");
						
						break;
					case 2:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Listar todos os Sabonetes\n\n");
						
						break;
					case 3:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Consultar Sabonete por ID\n\n");
					
						break;
					case 4:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Atualizar Sabonete\n\n");
					
						break;
					case 5:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Apagar Sabonete\n\n");
					
						break;
	
					default:
						System.out.println( Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
						
						break;	
			}
		}
	}

	private static void sobre() {
		System.out.println("\n***************************************************");
		System.out.println("                                                     ");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("\nGabriel Castro Navarro - gabrielc.navarro@hotmail.com");
		System.out.println("https://github.com/GabrielCNavarro");
		System.out.println("\n***************************************************");
		
	}
}