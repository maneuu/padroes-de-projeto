public class GerenteCompras extends AprovadorCompra {
    @Override
    public void aprovar(Compra compra) {
        if (compra.getValor() <= 5000.00) {
            exibirAprovacao(compra, "Gerente de compras");
            return;
        }

        encaminhar(compra);
    }
}
