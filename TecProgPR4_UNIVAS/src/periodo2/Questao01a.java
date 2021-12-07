package periodo2;

import java.util.Scanner;

public class Questao01a {
	
	public static void main(String[] args) {
		
		Questao01b carros = new Questao01b();
		Scanner input = new Scanner(System.in);
		
		int option, index = 0, espacoVazio = -1;
		
		System.out.println("|> Concessionária <|");
		
		do {
			System.out.println("1 - Cadastrar veículo");
			System.out.println("2 - Listar todos o veículos");
			System.out.println("3 - Excluir veículo");
			System.out.print("4 - Sair\n> ");
			
			option = input.nextInt();
			
		switch (option) {
			case 1:
				System.out.print("Digite o n° do chassi do motor: "); //chassi...? implementação ou gambiarra?
				carros.motor.chassi[index] = input.nextInt();
				System.out.print("Digite a marca do veículo: ");
				carros.marca[index] = input.next();
				System.out.print("Digite a cor do veículo: ");
				carros.cor[index] = input.next();
				System.out.print("Digite o ano de fabricação do veículo: ");
				carros.anoFabricação[index] = input.nextInt();
				System.out.print("Digite o ano do modelo do veículo: ");
				carros.anoModelo[index] = input.nextInt();
				System.out.print("Digite a potência do motor: ");
				carros.motor.potencia[index] = input.nextInt();
				System.out.print("Digite a quantidade de cilindos do motor: ");
				carros.motor.cilindros[index] = input.nextInt();
				
				index++;
				break;
			case 2:
				for (int i = 0; i < index; i++) {
					System.out.println("\n~ Veículo " + (i + 1) + ":");
					System.out.println("N° chassi: " + carros.motor.chassi[i]);
					System.out.println("Marca: " + carros.marca[i]);
					System.out.println("Cor: " + carros.cor[i]);
					System.out.println("Ano de Fab.: " + carros.anoFabricação[i]);
					System.out.println("Ano modelo: " + carros.anoModelo[i]);
					System.out.println("Pontência: " + carros.motor.potencia[i]);
					System.out.println("Cilindros: " + carros.motor.cilindros[i]);
				}
				break;
			case 3:
				System.out.println("Digite o chassi do veículo:");
				int chassi = input.nextInt();
				
				for (int i = 0; i < index; i++) {
					if (chassi == carros.motor.chassi[i]) {
						System.out.println("Veículo excluído!\n"
								+ "(Marca: " + carros.marca[i]
								+ "\nCor: " + carros.cor[i]
								+ "\nAno de fabricação: " + carros.anoFabricação[i]
								+ "\nAno modelo: " + carros.anoModelo[i]
								+ "\nPontência: " + carros.motor.potencia[i]
								+ "\nCilindros: " + carros.motor.cilindros[i] + ")");
						
						carros.marca[i] = null;
						carros.cor[i] = null;
						carros.anoFabricação[i] = 0;
						carros.anoModelo[i] = 0;
						carros.motor.potencia[i] = 0;
						carros.motor.cilindros[i] = 0;
						
						espacoVazio = i;
						index--;
						break;
						
					} else {
						System.out.println("Automóvel não econtrado! Tente novamente:");
						break;
					}
				}
				break;
			case 4:
				System.out.println("Concessionária fechada!");
				System.exit(0);
			default:
				System.out.println("Opção inválida, tente novamente!");
			}
		} while (true);
	}
}