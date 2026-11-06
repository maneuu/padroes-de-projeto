public class Desconto10 extends Desconto {
    @Override
    public void aplicar(Pedido pedido) {
        if (pedido.getValor() < 1000.00) {
            exibirDesconto(pedido, 10);
        } else {
            encaminhar(pedido);
        }
    }
}
