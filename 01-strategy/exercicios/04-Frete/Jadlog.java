public class Jadlog implements FreteStrategy {
    @Override
    public double calcular(double valorProdutos, double pesoKg, double distanciaKm) {
        return valorProdutos * 0.08 + pesoKg * 1.6 + distanciaKm * 0.35;
    }
}
