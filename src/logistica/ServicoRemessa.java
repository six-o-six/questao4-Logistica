package logistica;

public class ServicoRemessa {
	public static void shipProduct(Produto product) {
        System.out.println("Remessa: Enviando " + product.name + " para o cliente.");
    }
}