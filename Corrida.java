package testandoObjetos;

import java.io.IOException;
import java.util.Scanner;

public class Corrida {

	private static Scanner entrada;

	public static void main(String[] args) throws IOException, InterruptedException {
		Carro[] carros = CarregarCarros.escolher();
		System.out.println("Digite 1 para confirmar ou 0 para voltar:");
		entrada = new Scanner(System.in);
		Pista pista = null;
		int opcao = entrada.nextInt();
		if (opcao == 0) {
			Corrida.main(args);
		} else if (opcao == 1) {
			pista = CarregarPistas.escolher();
		} else {
			System.out.println("Digite um número válido");
		}
		correr(carros, pista);

	}

	public static void correr(Carro[] carros, Pista pista) throws IOException, InterruptedException {
		int tamanho = pista.getDistancia();
		int p1 = 0;
		int p2 = 0;
		while (p1 <= tamanho && p2 <= tamanho) {
			Thread.sleep(500);
			System.out.println("PLAYER 1");
			for (int i = 0; i <= tamanho + 6; i++) {
				System.out.print("_");
			}
			System.out.println();
			for (int i = 0; i <= (tamanho) / 2; i++) {
				if (i == p1) {
					System.out.print("Õ»=»o¬");
				} else {
					System.out.print(" -");
				}
			}
			System.out.println();
			for (int i = 0; i <= tamanho + 6; i++) {
				System.out.print("¶");
			}
			System.out.println();
			for (int i = 0; i <= tamanho + 6; i++) {
				System.out.print("_");
			}
			System.out.println();
			for (int i = 0; i <= (tamanho) / 2; i++) {
				if (i == p2) {
					System.out.print("Õ»=»o¬");
				} else {
					System.out.print(" -");
				}
			}
			System.out.println();
			System.out.println("COMPUTADOR");
			for (int i = 0; i < 12; i++) {
				System.out.println();
			}
			p1 = p1 + carros[0].getAceleracao();
			p2 = p2 + carros[1].getAceleracao();
		}
		if (p1 > p2) {
			System.out.println("PARABÉNS O SEU CARRO VENCEU!");
			
		} else {
			System.out.println("NÃO FOI DESSA VEZ!");
		}
	}
}
