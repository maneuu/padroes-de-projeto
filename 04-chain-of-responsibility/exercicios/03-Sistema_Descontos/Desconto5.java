public class Desconto5 extends Desconto {
    @Override
    public void aplicar(Pedido pedido) {
        if (pedido.getValor() < 500.00) {
            exibirDesconto(pedido, 5);
        } else {
            encaminhar(pedido);
        }
    }
}
