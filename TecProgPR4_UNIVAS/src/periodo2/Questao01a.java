package periodo2;

import java.util.Scanner;

public class Questao01a {
	
	public static void main(String[] args) {
		
		Questao01b carros = new Questao01b();
		Scanner input = new Scanner(System.in);
		
		int option, index = 0, espacoVazio = -1;
		
		System.out.println("|> Concession�ria <|");
		
		do {
			System.out.println("1 - Cadastrar ve�culo");
			System.out.println("2 - Listar todos o ve�culos");
			System.out.println("3 - Excluir ve�culo");
			System.out.print("4 - Sair\n> ");
			
			option = input.nextInt();
			
		switch (option) {
			case 1:
				System.out.print("Digite o n� do chassi do motor: "); //chassi...? implementa��o ou gambiarra?
				carros.motor.chassi[index] = input.nextInt();
				System.out.print("Digite a marca do ve�culo: ");
				carros.marca[index] = input.next();
				System.out.print("Digite a cor do ve�culo: ");
				carros.cor[index] = input.next();
				System.out.print("Digite o ano de fabrica��o do ve�culo: ");
				carros.anoFabrica��o[index] = input.nextInt();
				System.out.print("Digite o ano do modelo do ve�culo: ");
				carros.anoModelo[index] = input.nextInt();
				System.out.print("Digite a pot�ncia do motor: ");
				carros.motor.potencia[index] = input.nextInt();
				System.out.print("Digite a quantidade de cilindos do motor: ");
				carros.motor.cilindros[index] = input.nextInt();
				
				index++;
				break;
			case 2:
				for (int i = 0; i < index; i++) {
					System.out.println("\n~ Ve�culo " + (i + 1) + ":");
					System.out.println("N� chassi: " + carros.motor.chassi[i]);
					System.out.println("Marca: " + carros.marca[i]);
					System.out.println("Cor: " + carros.cor[i]);
					System.out.println("Ano de Fab.: " + carros.anoFabrica��o[i]);
					System.out.println("Ano modelo: " + carros.anoModelo[i]);
					System.out.println("Pont�ncia: " + carros.motor.potencia[i]);
					System.out.println("Cilindros: " + carros.motor.cilindros[i]);
				}
				break;
			case 3:
				System.out.println("Digite o chassi do ve�culo:");
				int chassi = input.nextInt();
				
				for (int i = 0; i < index; i++) {
					if (chassi == carros.motor.chassi[i]) {
						System.out.println("Ve�culo exclu�do!\n"
								+ "(Marca: " + carros.marca[i]
								+ "\nCor: " + carros.cor[i]
								+ "\nAno de fabrica��o: " + carros.anoFabrica��o[i]
								+ "\nAno modelo: " + carros.anoModelo[i]
								+ "\nPont�ncia: " + carros.motor.potencia[i]
								+ "\nCilindros: " + carros.motor.cilindros[i] + ")");
						
						carros.marca[i] = null;
						carros.cor[i] = null;
						carros.anoFabrica��o[i] = 0;
						carros.anoModelo[i] = 0;
						carros.motor.potencia[i] = 0;
						carros.motor.cilindros[i] = 0;
						
						espacoVazio = i;
						index--;
						break;
						
					} else {
						System.out.println("Autom�vel n�o econtrado! Tente novamente:");
						break;
					}
				}
				break;
			case 4:
				System.out.println("Concession�ria fechada!");
				System.exit(0);
			default:
				System.out.println("Op��o inv�lida, tente novamente!");
			}
		} while (true);
	}
}