public class Desconto20Porcento implements DescontoStrategy {
    @Override
    public double calcular(double valorOriginal) {
        return valorOriginal * 0.80;
    }
}
