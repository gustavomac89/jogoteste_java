package testandoObjetos;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CarregarPistas {
	public static Pista[] carregar() {
		Path filePath = Paths.get("C:/pistas.txt");
		Scanner scanner;
		Pista[] pistas = new Pista[3];
		try {
			scanner = new Scanner(filePath);
			int i = 0;
			while (scanner.hasNext()) {
				String[] split = scanner.next().split(";");
				Pista pista = new Pista();
				pista.setNome(split[0]);
				pista.setPais(split[1]);
				pista.setDistancia(Integer.parseInt(split[2]));
				pistas[i] = pista;
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pistas;
		
	}
	private static Scanner entrada; 
	public static Pista escolher() {
		Pista[] pistas = carregar();
		System.out.println("Essas são as pistas disponiveis:");
		System.out.println("________________________________________");
		for (int i = 1; i < pistas.length + 1; i++) {
			System.out.println("Pista número "+ i + " de " + pistas.length);
			System.out.println("Nome: " + pistas[i - 1].getNome());
			System.out.println("Pais: " + pistas[i - 1].getPais());
			System.out.println("Distancia: " + pistas[i - 1].getDistancia());
			System.out.println("________________________________________");

		}
		System.out.println("Digite o número da pista selecionada:");
		entrada = new Scanner(System.in);
		int selecao;
		selecao = entrada.nextInt();
		Pista pista = null;
		for (int i = 1; i < pistas.length + 1; i++) {
			if (selecao == i && selecao > 0) {
				System.out.println("________________________________________");
				System.out.println("Pista selecionada:");
				System.out.println("__________________________");
				System.out.println("Nome: " + pistas[i - 1].getNome());
				System.out.println("Pais: " + pistas[i - 1].getPais());
				System.out.println("Distancia: " + pistas[i - 1].getDistancia());
				System.out.println("________________________________________");
				pista = pistas[i - 1];
			}	

		}
		return pista;
	}
}
