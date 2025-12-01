package logistica;

public class PedidoFacade {

    public void processarPedido(Produto produto) {
        System.out.println("--- Iniciando processamento do pedido: " + produto.name + " ---");
        
        // Orquestração dos subsistemas
        if (ServicoEstoque.isAvailable(produto)) {
            System.out.println("Estoque verificado.");
            
            if (ServicoPagamento.makePayment()) {
                System.out.println("Pagamento realizado.");
                
                ServicoRemessa.shipProduct(produto);
                System.out.println("Processo finalizado com sucesso.");
            } else {
                System.out.println("Falha no pagamento.");
            }
        } else {
            System.out.println("Produto indisponível.");
        }
    }
}