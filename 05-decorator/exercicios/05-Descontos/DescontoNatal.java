public class DescontoNatal extends PrecoDecorator {
    public DescontoNatal(Preco preco) {
        super(preco);
    }

    @Override
    public String getDescricao() {
        return preco.getDescricao() + " + (desconto de Natal)";
    }

    @Override
    public double getValor() {
        return preco.getValor() * 0.90;
    }
}
