public class PedidoOnline extends ProcessamentoPedido {
    @Override
    protected void validarPedido() {
        System.out.println("Validando endereco e dados de pagamento");
    }

    @Override
    protected void calcularTotal() {
        System.out.println("Calculando total com frete");
    }

    @Override
    protected void separarPedido() {
        System.out.println("Separando itens no centro de distribuicao");
    }

    @Override
    protected void enviarPedido() {
        System.out.println("Enviando pedido pela transportadora");
    }

    // Este pedido utiliza o hook de notificacao.
    @Override
    protected void enviarNotificacao() {
        System.out.println("Enviando e-mail com o codigo de rastreamento");
    }

    // Este pedido tambem precisa de uma auditoria especifica.
    @Override
    protected void registrarAuditoria() {
        System.out.println("Registrando pedido online no sistema");
    }
}
