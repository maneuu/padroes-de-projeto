public abstract class Pagamento {
    // Template Method: define a ordem fixa do processamento do pagamento.
    public final void processarPagamento() {
        validarDados();
        autorizarPagamento();
        realizarPagamento();
        emitirComprovante();
        notificarCliente();
    }

    // Cada forma de pagamento possui regras proprias de validacao.
    protected abstract void validarDados();

    // A autorizacao depende do servico usado pela forma de pagamento.
    protected abstract void autorizarPagamento();

    // Etapa obrigatoria: conclui a transacao.
    protected abstract void realizarPagamento();

    // Etapa comum para qualquer pagamento.
    private void emitirComprovante() {
        System.out.println("Emitindo comprovante do pagamento");
    }

    // Hook: a notificacao pode ser personalizada ou ignorada.
    protected void notificarCliente() {}
}
