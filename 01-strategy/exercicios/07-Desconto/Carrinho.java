public class Carrinho {
    private final double valorProdutos;
    private DescontoStrategy estrategia;

    public Carrinho(double valorProdutos, DescontoStrategy estrategia) {
        this.valorProdutos = valorProdutos;
        this.estrategia = estrategia;
    }

    public void definirDesconto(DescontoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularValorFinal() {
        return estrategia.calcular(valorProdutos);
    }
}
