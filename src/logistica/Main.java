package logistica;

public class Main {
    public static void main(String[] args) {
        // Preparação dos dados
        Produto produto1 = new Produto(1, "Smartphone");
        Produto produto2 = new Produto(2, "Notebook");

        // O cliente interage apenas com a fachada
        PedidoFacade facade = new PedidoFacade();

        // Processamento simplificado
        facade.processarPedido(produto1);
        System.out.println();
        facade.processarPedido(produto2);
    }
}