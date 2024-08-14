package hakathon;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CaixaSupermercado {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		ArrayList<String> nomesProdutos = new ArrayList<>();
		ArrayList<Double> valoresProdutos = new ArrayList<>();

		while (true) {
			System.out.println("digite o nome do produto (ou 'X' para encerrar):");
			String nomeProduto = Scanner.nextLine();
			if (nomeProduto.equalsIgnoreCase("X")) {
				break;

			}
			double valorProduto =0;
			boolean valorValido = false;
			while (!valorValido) {
				System.out.println("digite o valor do produto:");
				try {
					valorProduto = Scanner.nextDouble();
					Scanner.nextLine();
					valorValido =true;
				} catch (InputMismatchException e) {
					System.out.println("Valor invalido!por favor, insira um numero valido");
					Scanner.nextLine();
				}
			}
			nomesProdutos.add(nomeProduto);
			valoresProdutos.add(valorProduto);
		}

		exibirListaCompras(nomesProdutos, valoresProdutos);
		double valorTotal = calcularValorTotal(valoresProdutos);
		System.out.println("valor total a pagar: R$"+ String.format("%.2f", valorTotal));
	}
	public static void exibirListaCompras (ArrayList<String> nomes, ArrayList<Double>valores) {
		System.out.println("\nLista de compras:");
		for (int i = 0; i <nomes.size();i++) {
			System.out.println(nomes.get(i)+"- R$"+ String.format("%.2f", valores.get(i)));

		}
	}
	public static double calcularValorTotal (ArrayList<Double>valores) {
		double total = 0;
		for (double valor:valores) {
			total+=valor;
		}
		return total;


	}
}

