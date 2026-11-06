public class AnalistaCompras extends AprovadorCompra {
    @Override
    public void aprovar(Compra compra) {
        if (compra.getValor() <= 1000.00) {
            exibirAprovacao(compra, "Analista de compras");
            return;
        }

        encaminhar(compra);
    }
}
