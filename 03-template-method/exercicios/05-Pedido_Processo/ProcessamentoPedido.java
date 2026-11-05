public abstract class ProcessamentoPedido {
    // Template Method: define a ordem fixa do processamento de qualquer pedido.
    public final void processarPedido() {
        validarPedido();
        calcularTotal();
        separarPedido();
        enviarPedido();
        enviarNotificacao();
        registrarAuditoria();
    }

    // Etapa obrigatoria: cada tipo de pedido possui regras de validacao.
    protected abstract void validarPedido();

    // Etapa obrigatoria: o total depende do tipo de pedido.
    protected abstract void calcularTotal();

    // Etapa obrigatoria: cada canal separa os itens de uma forma diferente.
    protected abstract void separarPedido();

    // Etapa obrigatoria: o envio varia conforme o pedido.
    protected abstract void enviarPedido();

    // Hook: a notificacao pode ser personalizada ou ignorada.
    protected void enviarNotificacao() {}

    // Hook: subclasses podem registrar informacoes adicionais.
    protected void registrarAuditoria() {}
}
