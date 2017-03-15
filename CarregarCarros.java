package testandoObjetos;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CarregarCarros {
	public static Carro[] carregar() {
		Path filePath = Paths.get("C:/carros.txt");
		Scanner scanner;
		Carro[] carros = new Carro[3];
		try {
			scanner = new Scanner(filePath);
			int i = 0;
			while (scanner.hasNext()) {
				String[] split = scanner.next().split(";");
				Carro carro = new Carro();
				carro.setNome(split[0]);
				carro.setMarca(split[1]);
				carro.setAno(Integer.parseInt(split[2]));
				carro.setAceleracao(Integer.parseInt(split[3]));
				carro.setVelocidadeMaxima(Integer.parseInt(split[4]));
				carros[i] = carro;
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return carros;
		
	}
	private static Scanner entrada; 
	private static Carro[] selecionados = new Carro[2];
	public static Carro[] escolher() {
		Carro[] carros = carregar();
		System.out.println("Esses são os carros disponiveis:");
		System.out.println("________________________________________");
		for (int i = 1; i < carros.length + 1; i++) {
			System.out.println("Carro número "+ i + " de " + carros.length);
			System.out.println("Nome: " + carros[i - 1].getNome());
			System.out.println("Marca: " + carros[i - 1].getMarca());
			System.out.println("Ano: " + carros[i - 1].getAno());
			System.out.println("________________________________________");

		}
		System.out.println("Digite o número do carro selecionado:");
		entrada = new Scanner(System.in);
		Random random = new Random();
		int selecao;
		selecao = entrada.nextInt();
		int aleatorio = 0;
		while( aleatorio == 0) {
		 aleatorio = random.nextInt(carros.length + 1);
		}
		for (int i = 1; i < carros.length + 1; i++) {
			if (selecao == i) {
				System.out.println("________________________________________");
				System.out.println("Carro selecionado P1:");
				System.out.println("__________________________");
				System.out.println("Nome: " + carros[i - 1].getNome());
				System.out.println("Marca: " + carros[i - 1].getMarca());
				System.out.println("Ano: " + carros[i - 1].getAno());
				System.out.println("________________________________________");
				selecionados[0] = carros[i - 1];
			}
			if (aleatorio == i) {
				System.out.println("________________________________________");
				System.out.println("Carro selecionado COMPUTADOR:");
				System.out.println("__________________________");
				System.out.println("Nome: " + carros[i - 1].getNome());
				System.out.println("Marca: " + carros[i - 1].getMarca());
				System.out.println("Ano: " + carros[i - 1].getAno());
				System.out.println("________________________________________");
				selecionados[1] = carros[i - 1];
			}	

		}
		return selecionados;
	}
}
