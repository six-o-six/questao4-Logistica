package logistica;

public class ServicoEstoque {
	public static boolean isAvailable(Produto product) {
        System.out.println("Estoque: Produto " + product.name + " está disponível.");
        return true; 
    }
}