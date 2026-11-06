public class Loggi extends Frete {
    @Override
    public void calcular(Pedido pedido) {
        if (pedido.getPesoKg() <= 5 && pedido.getDistanciaKm() <= 50) {
            double valorFrete = pedido.getPesoKg() * 1.8
                    + pedido.getDistanciaKm() * 0.28;
            exibirFrete(pedido, "Loggi", valorFrete);
            return;
        }

        encaminhar(pedido);
    }
}
