package hakathon;
import java.util.ArrayList;
public class hakathon {

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