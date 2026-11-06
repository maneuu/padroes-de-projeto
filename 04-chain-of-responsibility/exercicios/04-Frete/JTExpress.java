public class JTExpress extends Frete {
    @Override
    public void calcular(Pedido pedido) {
        double valorFrete = pedido.getValorProdutos() * 0.05
                + pedido.getPesoKg() * 2.8
                + pedido.getDistanciaKm() * 0.45 + 10.0;
        exibirFrete(pedido, "J&T Express", valorFrete);
    }
}
