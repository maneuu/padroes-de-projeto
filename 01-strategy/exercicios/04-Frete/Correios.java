public class Correios implements FreteStrategy {
    @Override
    public double calcular(double valorProdutos, double pesoKg, double distanciaKm) {
        return pesoKg * 2.2 + distanciaKm * 0.4 + 12.0;
    }
}
