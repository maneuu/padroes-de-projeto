public class Pedido {
    private final double valorTotal;
    private PagamentoStrategy estrategia;

    public Pedido(double valorTotal, PagamentoStrategy estrategia) {
        this.valorTotal = valorTotal;
        this.estrategia = estrategia;
    }

    public void definirPagamento(PagamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void pagar() {
        estrategia.pagar(valorTotal);
    }
}
