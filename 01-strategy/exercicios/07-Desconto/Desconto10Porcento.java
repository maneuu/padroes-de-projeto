public class Desconto10Porcento implements DescontoStrategy {
    @Override
    public double calcular(double valorOriginal) {
        return valorOriginal * 0.90;
    }
}
