public class JTExpress implements FreteStrategy {
    @Override
    public double calcular(double valorProdutos, double pesoKg, double distanciaKm) {
        return valorProdutos * 0.05 + pesoKg * 2.8 + distanciaKm * 0.45 + 10.0;
    }
}
