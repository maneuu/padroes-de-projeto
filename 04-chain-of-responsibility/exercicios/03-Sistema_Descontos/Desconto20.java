public class Desconto20 extends Desconto {
    @Override
    public void aplicar(Pedido pedido) {
        if (pedido.getValor() >= 1000.00) {
            exibirDesconto(pedido, 20);
        } else {
            encaminhar(pedido);
        }
    }
}
