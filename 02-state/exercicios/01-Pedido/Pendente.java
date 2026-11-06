public class Pendente implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento aprovado.");
        pedido.definirEstado(new Pago());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("O pedido precisa ser pago antes do envio.");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Estado atual: Pendente");
    }
}
