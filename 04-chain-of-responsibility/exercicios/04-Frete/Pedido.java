public class Pedido {
    private final String descricao;
    private final double valorProdutos;
    private final double pesoKg;
    private final double distanciaKm;

    public Pedido(String descricao, double valorProdutos, double pesoKg,
            double distanciaKm) {
        this.descricao = descricao;
        this.valorProdutos = valorProdutos;
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorProdutos() {
        return valorProdutos;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
}
