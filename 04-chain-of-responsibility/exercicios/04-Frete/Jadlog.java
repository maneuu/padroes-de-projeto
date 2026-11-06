public class Jadlog extends Frete {
    @Override
    public void calcular(Pedido pedido) {
        if (pedido.getPesoKg() <= 20 && pedido.getDistanciaKm() <= 300) {
            double valorFrete = pedido.getValorProdutos() * 0.08
                    + pedido.getPesoKg() * 1.6
                    + pedido.getDistanciaKm() * 0.35;
            exibirFrete(pedido, "Jadlog", valorFrete);
            return;
        }

        encaminhar(pedido);
    }
}
