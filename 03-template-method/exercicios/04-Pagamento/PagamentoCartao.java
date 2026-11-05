public class PagamentoCartao extends Pagamento {
    @Override
    protected void validarDados() {
        System.out.println("Validando numero, validade e titular do cartao");
    }

    @Override
    protected void autorizarPagamento() {
        System.out.println("Solicitando autorizacao a operadora do cartao");
    }

    @Override
    protected void realizarPagamento() {
        System.out.println("Confirmando pagamento no cartao");
    }

    @Override
    protected void notificarCliente() {
        System.out.println("Enviando notificacao por e-mail");
    }
}
