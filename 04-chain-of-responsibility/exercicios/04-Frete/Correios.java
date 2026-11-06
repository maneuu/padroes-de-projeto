public class Correios extends Frete {
    @Override
    public void calcular(Pedido pedido) {
        if (pedido.getPesoKg() <= 30) {
            double valorFrete = pedido.getPesoKg() * 2.2
                    + pedido.getDistanciaKm() * 0.4 + 12.0;
            exibirFrete(pedido, "Correios", valorFrete);
            return;
        }

        encaminhar(pedido);
    }
}
