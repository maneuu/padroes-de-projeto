public class Loggi implements FreteStrategy {
    @Override
    public double calcular(double valorProdutos, double pesoKg, double distanciaKm) {
        return pesoKg * 1.8 + distanciaKm * 0.28;
    }
}
