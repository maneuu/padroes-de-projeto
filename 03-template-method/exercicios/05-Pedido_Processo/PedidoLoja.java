public class PedidoLoja extends ProcessamentoPedido {
    @Override
    protected void validarPedido() {
        System.out.println("Validando cadastro do cliente no caixa");
    }

    @Override
    protected void calcularTotal() {
        System.out.println("Calculando total com desconto da loja");
    }

    @Override
    protected void separarPedido() {
        System.out.println("Separando itens no estoque da loja");
    }

    @Override
    protected void enviarPedido() {
        System.out.println("Disponibilizando pedido para retirada");
    }

    // O pedido de loja nao envia notificacao: usa o comportamento vazio do hook.

    @Override
    protected void registrarAuditoria() {
        System.out.println("Registrando retirada no sistema da loja");
    }
}
