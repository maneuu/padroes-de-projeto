public class Pedido {
    private final double valorBase;
    private ImpostoStrategy estrategia;

    public Pedido(double valorBase, ImpostoStrategy estrategia) {
        this.valorBase = valorBase;
        this.estrategia = estrategia;
    }

    public void definirImposto(ImpostoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularValorComImposto() {
        return valorBase + estrategia.calcular(valorBase);
    }
}
