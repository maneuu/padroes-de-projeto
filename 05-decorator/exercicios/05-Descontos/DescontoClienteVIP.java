public class DescontoClienteVIP extends PrecoDecorator {
    public DescontoClienteVIP(Preco preco) {
        super(preco);
    }

    @Override
    public String getDescricao() {
        return preco.getDescricao() + " + (desconto de cliente VIP)";
    }

    @Override
    public double getValor() {
        return preco.getValor() * 0.85;
    }
}
