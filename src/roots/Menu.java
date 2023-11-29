package roots;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import roots.controller.SaboneteController;
import roots.model.Organico;
import roots.model.Vegano;
import roots.util.Cores;


public class Menu {

	public static void main(String[] args) {

		SaboneteController sabonetes = new SaboneteController();
		Scanner leia = new Scanner(System.in);
		
		
		Organico og1 = new Organico(sabonetes.gerarId(), "Sabonete de Rosa Damascena", 1, 12.0f, "Extrato de Leite de Cabra e Mel");
		sabonetes.criarSabonete(og1);

		Vegano vg1 = new Vegano(sabonetes.gerarId(), "Sabonete Tea Tree", 2, 15.0f, "Óleo Essencial Tea Tree e extrato de Menta");
		sabonetes.criarSabonete(vg1);
		
		
		String nome, ingredOrganicos, ingredVegetais;
		int id, tipo;
		float preco;
		int opcao;
		
		
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
			opcao = leia.nextInt();
			System.out.println("*                                                                       *"+ Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if (opcao == 0) {
				System.out.println( Cores.TEXT_WHITE_BOLD + "\n Obrigado pela preferência! Cuide-se com os produtos Roots!");
				sobre();
				leia.close();
				System.exit(0);
			}
		
			switch (opcao) {
					case 1:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Digite o tipo do Sabonete:\\n1 - Oragânico\\n2 - Vegano\n\n");
						System.out.print("tipo: ");
						tipo = leia.nextInt();

						switch (tipo) {
							case 1 -> {
								System.out.print("Digite o nome do Sabonete: ");
								nome = leia.nextLine();
								System.out.print("Digite o preço do respectivo Sabonete: ");
								preco = leia.nextFloat();
								System.out.print("Digite o(s) ingrediente(s) Oragânico(s) do Sabonete: ");
								ingredOrganicos = leia.nextLine();
								sabonetes.criarSabonete(new Organico(sabonetes.gerarId(), nome, tipo, preco, ingredOrganicos));
							}
							case 2 -> {
								System.out.print("Digite o nome do Sabonete: ");
								nome = leia.nextLine();
								System.out.print("Digite o preço do respectivo Sabonete: ");
								preco = leia.nextFloat();
								System.out.print("Digite o(s) ingrediente(s) Vegano(s) do Sabonete: ");
								ingredVegetais = leia.nextLine();
								sabonetes.criarSabonete(new Vegano(sabonetes.gerarId(), nome, tipo, preco, ingredVegetais));
							}
						}
						keyPress();
						break;
					case 2: 
						System.out.println( Cores.TEXT_WHITE_BOLD + "Lista de todos os Sabonetes:\n\n");
						sabonetes.listarSabonetes();
						keyPress();
						break;
					case 3: 
						System.out.println( Cores.TEXT_WHITE_BOLD + "Digite o ID do Sabonete: ");
						id = leia.nextInt();
						sabonetes.consultarSaboneteId(id);
						keyPress();
						break;
					case 4: 
						System.out.println( Cores.TEXT_WHITE_BOLD + "Atualizar produto\n\n");
						System.out.println("Digite o id do Sabonete: ");
						id = leia.nextInt();
						
						var buscaSabonete = sabonetes.buscarNaCollection(id);  
						
						if(buscaSabonete != null) {
													
							tipo = buscaSabonete.getTipo();
							
							System.out.printf("Digite o novo nome do produto: ");
							nome = leia.next();
							System.out.printf("Digite o novo preço do produto: ");
							preco = leia.nextFloat();
							
							do {
								System.out.println("Digite o tipo do Sabonete:\\n1 - Oragânico\\n2 - Vegano\n\n");
								System.out.print("tipo: ");
								tipo = leia.nextInt();
							
								
							}while(tipo < 1 && tipo > 2);
							
							switch (tipo) {
							case 1 -> {
								System.out.println("Digite os novos ingredientes orgânicos do Sabonete: ");
								ingredOrganicos = leia.nextLine();
								sabonetes.atualizarSabonete(new Organico(id, nome, tipo, preco, ingredOrganicos));
							}
							case 2 -> {
								System.out.println("Digite os novos ingredientes vegetais do Sabonete: ");
								ingredVegetais = leia.nextLine();
								sabonetes.atualizarSabonete(new Vegano(id, nome, tipo, preco, ingredVegetais));
							}
							default -> {
								System.out.println("Tipo de Produto inválido!");
							}
							}
						} else {
							System.out.println("Produto não encontrado!");
						}
							keyPress();
							break;
					case 5:
						System.out.println( Cores.TEXT_WHITE_BOLD + "Apagar Sabonete\n\n");
						System.out.println("Digite o ID do Produto: ");
						id = leia.nextInt();
						
						keyPress();
						break;
						default:
						System.out.println( Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
						break;
						
			}
		}
	}

	private static void sobre() {
		System.out.println("\n*****************************************************");
		System.out.println("                                                       ");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("\nGabriel Castro Navarro - gabrielc.navarro@hotmail.com");
		System.out.println("https://github.com/GabrielCNavarro");
		System.out.println("\n*****************************************************");
		
	}
	
	public static void keyPress() {
		try {
			System.out.println("\nPressione Enter para Continuar");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter");
		}
	}
}