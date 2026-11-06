public abstract class Desconto {
    private Desconto proximo;

    public Desconto definirProximo(Desconto proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract void aplicar(Pedido pedido);

    protected void encaminhar(Pedido pedido) {
        if (proximo == null) {
            System.out.println("Nenhum desconto disponivel para: "
                    + pedido.getDescricao());
            return;
        }

        proximo.aplicar(pedido);
    }

    protected void exibirDesconto(Pedido pedido, int percentual) {
        double valorDesconto = pedido.getValor() * percentual / 100;
        double valorFinal = pedido.getValor() - valorDesconto;

        System.out.printf("%s: %d%% de desconto - valor final R$ %.2f%n",
                pedido.getDescricao(), percentual, valorFinal);
    }
}
