public class SemDesconto implements DescontoStrategy {
    @Override
    public double calcular(double valorOriginal) {
        return valorOriginal;
    }
}
