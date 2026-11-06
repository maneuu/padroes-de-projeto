public class Pago implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("O pedido ja foi pago.");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado.");
        pedido.definirEstado(new Enviado());
    }

    @Override
    public void exibirStatus() {
        System.out.println("Estado atual: Pago");
    }
}
