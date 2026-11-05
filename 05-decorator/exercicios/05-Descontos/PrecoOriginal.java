public class PrecoOriginal implements Preco {
    private final String produto;
    private final double valor;

    public PrecoOriginal(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    @Override
    public String getDescricao() {
        return produto;
    }

    @Override
    public double getValor() {
        return valor;
    }
}
