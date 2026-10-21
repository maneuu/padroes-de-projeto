public class ISS implements ImpostoStrategy {
    @Override
    public double calcular(double valorBase) {
        return valorBase * 0.05;
    }
}
