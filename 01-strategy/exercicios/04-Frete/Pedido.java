public class Pedido {
    private final double valorProdutos;
    private final double pesoKg;
    private final double distanciaKm;
    private FreteStrategy estrategia;

    public Pedido(double valorProdutos, double pesoKg, double distanciaKm, FreteStrategy estrategia) {
        this.valorProdutos = valorProdutos;
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
        this.estrategia = estrategia;
    }

    public void definirFrete(FreteStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotal() {
        double valorFrete = estrategia.calcular(valorProdutos, pesoKg, distanciaKm);
        return valorProdutos + valorFrete;
    }
}
