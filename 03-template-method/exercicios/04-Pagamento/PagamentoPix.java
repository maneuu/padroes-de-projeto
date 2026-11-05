public class PagamentoPix extends Pagamento {
    @Override
    protected void validarDados() {
        System.out.println("Validando chave Pix e valor da transferencia");
    }

    @Override
    protected void autorizarPagamento() {
        System.out.println("Validando o QR Code ou codigo Pix");
    }

    @Override
    protected void realizarPagamento() {
        System.out.println("Confirmando transferencia Pix");
    }

    @Override
    protected void notificarCliente() {
        System.out.println("Enviando notificacao no aplicativo");
    }
}
