public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(
                199.90,
                new PagamentoPayPal("cliente@email.com", "123456"));

        pedido.pagar();

        pedido.definirPagamento(
                new PagamentoCartaoCredito(
                        "1111 2222 3333 4444",
                        "12/29",
                        "123"));
        pedido.pagar();
    }
}
