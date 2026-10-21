public class DescontoClienteVIP implements DescontoStrategy {
    @Override
    public double calcular(double valorOriginal) {
        return valorOriginal * 0.70;
    }
}
