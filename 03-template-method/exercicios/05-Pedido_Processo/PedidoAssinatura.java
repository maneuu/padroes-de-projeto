public class PedidoAssinatura extends ProcessamentoPedido {
    @Override
    protected void validarPedido() {
        System.out.println("Validando assinatura ativa do cliente");
    }

    @Override
    protected void calcularTotal() {
        System.out.println("Calculando mensalidade recorrente");
    }

    @Override
    protected void separarPedido() {
        System.out.println("Separando itens do kit mensal");
    }

    @Override
    protected void enviarPedido() {
        System.out.println("Enviando kit pelo servico de entrega");
    }

    // A assinatura sobrescreve apenas o hook de notificacao.
    @Override
    protected void enviarNotificacao() {
        System.out.println("Enviando mensagem sobre a proxima cobranca");
    }

    // Nao ha auditoria adicional para este tipo de pedido.
}
