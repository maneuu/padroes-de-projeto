public class Enviado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Nao e possivel pagar um pedido que ja foi enviado.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("O pedido ja foi enviado.");
    }

    @Override
    public void exibirStatus() {
        System.out.println("Estado atual: Enviado");
    }
}
